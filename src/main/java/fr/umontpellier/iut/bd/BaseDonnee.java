package fr.umontpellier.iut.bd;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

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
        System.out.println("Enter data base name :");
        String dbms = in.nextLine();
        System.out.println("Enter server name :");
        String serverName = in.nextLine();
        System.out.println("Enter port number :");
        String portNumber = in.nextLine();

        setConnection(userName, password, dbms, serverName, portNumber);
    }

    public static void setConnection(String userName, String password, String dbms, String serverName,
            String portNumber) {
        Properties connectionProps = new Properties();
        connectionProps.put("user", userName);
        connectionProps.put("password", password);
        try {
            connection = DriverManager.getConnection("jdbc:" + dbms + "://" + serverName + ":" + portNumber + "/",
                    connectionProps);
        } catch (SQLException e) {
            System.out.println("La connexion n'a pas pu être effectué !");
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
