package fr.umontpellier.iut.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
import java.util.TimeZone;

import com.mysql.cj.jdbc.Driver;

import fr.umontpellier.iut.GestionnairePseudonyme;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class BaseDonnee {

    private BaseDonnee() {
        throw new IllegalStateException("Utility class");
    }

    private static Connection connection;

    /**
     * @param connection the connection to set
     */
    public static void setConnection(Scanner in) {
        System.out.println("Enter user :");
        String userName = in.nextLine();
        System.out.println("Enter password :");
        String password = in.nextLine();
        System.out.println("Enter type data base (exemple: mysql) :");
        String dbms = in.nextLine();
        System.out.println("Enter server name :");
        String serverName = in.nextLine();
        System.out.println("Enter port number :");
        String portNumber = in.nextLine();
        System.out.println("Enter data base name :");
        String nomBD = in.nextLine();

        setConnection(userName, password, dbms, serverName, portNumber, nomBD);
    }

    public static void setConnection(String userName, String password, String dbms, String serverName,
            String portNumber, String nomBD) {
        Properties connectionProps = new Properties();
        connectionProps.put("user", userName);
        connectionProps.put("password", password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = String.format(
                    "jdbc:%s://%s:%s/%s?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=%s",
                    dbms, serverName, portNumber, nomBD, TimeZone.getDefault().getID());
            connection = DriverManager.getConnection(url, connectionProps);
        } catch (SQLException e) {
            System.out.println("La connexion à la Base de Donnée n'a pas pu être effectué !");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Le fichier .jar n'as pas pus être trouvé");
            e.printStackTrace();
        }
    }

    public static void initBaseDonneePseudos() {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(RequetesSQL.DROP_TABLE_PSEUDOS);
            stmt.execute(RequetesSQL.CREATE_TABLE_PSEUDOS);
            stmt.execute(RequetesSQL.INIT_TABLE_PSEUDOS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getPseudoSinonAttribuePseudoEtAvertieUser(TextChannel channel, User user) {
        final int AUCUN_PSEUDO_TROUVE = -1;
        long idUser = user.getIdLong();
        long idGuild = channel.getGuild().getIdLong();
        int indexPseudo = BaseDonnee.getPseudoIndex(idUser, idGuild);
        if (indexPseudo == AUCUN_PSEUDO_TROUVE) {
            indexPseudo = BaseDonnee.setPseudo(idUser, idGuild);
            String message = GestionnairePseudonyme.getMessageNominationParLaCape(indexPseudo);
            user.openPrivateChannel().complete().sendMessage(message).queue();
        }
        return GestionnairePseudonyme.getDenomination(indexPseudo);
    }

    public static int getPseudoIndex(long idUser, long idGuild) {
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(RequetesSQL.selectIndexPseudo(idUser, idGuild));
            if (rs.next())
                return rs.getInt("indexPseudo");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static int setPseudo(long idUser, long idGuild) {
        int indexPseudo = -1;
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(RequetesSQL.recuperePseudoNonUtilise(idGuild));
            if (rs.next()) {
                indexPseudo = rs.getInt("indexPseudo");
                stmt.execute(RequetesSQL.insertIntoTablePseudos(idUser, idGuild, indexPseudo));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return indexPseudo;
    }

    public static int attribuerNouveauPseudo(long idUser, long idGuild) {
        BaseDonnee.deleteAffectationPseudo(idUser, idGuild);
        return BaseDonnee.setPseudo(idUser, idGuild);
    }

    public static void deleteAffectationPseudo(long idUser, long idGuild) {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(RequetesSQL.deleteAffection(idUser, idGuild));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
