package fr.umontpellier.iut;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;

public class App {
    /**
     *
     */
    private static final JDABuilder ANIMAGUS_BUILDER = new JDABuilder(AccountType.BOT)
            .setActivity(Activity.listening("!help")).addEventListeners(new GestionnaireEvents())
            .setCompression(Compression.NONE);

    public static void main(String[] args) {
        verifieArguments(args);
        JDABuilder builder = ANIMAGUS_BUILDER.setToken(args[0]);
        try {
            builder.build();
        } catch (LoginException e) {
            System.err.println("Un problème est survenue lors de la connexion.\n Veuillez récrire le token");
        }
    }

    private static void verifieArguments(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Veuillez mettre en argument le token du bot discord");
        }
    }
}
