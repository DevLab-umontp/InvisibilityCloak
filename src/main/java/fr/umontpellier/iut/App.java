package fr.umontpellier.iut;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

import fr.umontpellier.iut.bd.BaseDonnee;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;

public class App {
    /**
     *
     */
    private static final JDABuilder INVISIBILITY_CLOAK_BUILDER = new JDABuilder(AccountType.BOT)
            .setActivity(Activity.listening("!help")).addEventListeners(new GestionnaireEvents())
            .setCompression(Compression.NONE);

    public static void main(String[] args) {
        initBotDiscord(args);
        initBaseDonnee(args);
    }

    private static void initBaseDonnee(String[] args) {
        if (verifieArgumentsPourConnexionBD(args))
            BaseDonnee.setConnection(args[1], args[2], args[3], args[4], args[5]);
        else
            BaseDonnee.setConnection(new Scanner(System.in));
        BaseDonnee.initBaseDonneePseudos();
    }

    private static boolean verifieArgumentsPourConnexionBD(String[] args) {
        if (args.length < 6) {
            System.out.println(
                    "Veuillez mettre en argument l' userName, password, dbms, serverName, portNumber de la base de donnée");
            return false;
        }
        return true;
    }

    private static void initBotDiscord(String[] args) {
        verifieArgumentsPourConnexionBotDiscord(args);
        JDABuilder builder = INVISIBILITY_CLOAK_BUILDER.setToken(args[0]);
        try {
            builder.build();
        } catch (LoginException e) {
            System.err.println(
                    "Un problème est survenue lors de la connexion du bot Discord.\n Veuillez récrire le token");
        }
    }

    private static void verifieArgumentsPourConnexionBotDiscord(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Veuillez mettre en argument le token du bot discord");
        }
    }
}
