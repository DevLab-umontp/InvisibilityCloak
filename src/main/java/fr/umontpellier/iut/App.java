package fr.umontpellier.iut;

import java.util.Scanner;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.utils.Compression;

public class App {
    /**
     *
     */
    private static final JDABuilder ANIMAGUS_BUILDER = new JDABuilder(AccountType.BOT)
            .addEventListeners(new GestionnaireEvents())
            .setCompression(Compression.NONE);

    public static void main(String[] args) {
        verifieArguments(args);
        JDABuilder builder = ANIMAGUS_BUILDER.setToken(args[0]);
        login(builder);
    }

    private static void verifieArguments(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Veuillez mettre en argument le token du bot discord");
        }
    }

    private static void login(JDABuilder builder) {
        try {
            for (int i = 0; i < 10; i++)
                builder.useSharding(i, 10).build();
        } catch (javax.security.auth.login.LoginException e) {
            System.err.println("Un problème est survenue lors de la connexion.\n Veuillez récrire le token :");
            corrigerToken(builder);
            login(builder);
        }
    }

    private static void corrigerToken(JDABuilder builder) {
        Scanner in = new Scanner(System.in);
        builder.setToken(in.next());
        in.close();
    }
}
