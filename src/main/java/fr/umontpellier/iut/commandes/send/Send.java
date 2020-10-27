package fr.umontpellier.iut.commandes.send;

import fr.umontpellier.iut.commandes.Commande;
import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;

interface Send extends Commande {

    @Override
    default void execute(Message messageRecue) {
        String[] messageSplit = messageRecue.getContentRaw().split(" ", 3);
        if (messageSplit.length != 3)
            messageRecue.getChannel().sendMessage("Je n'ai malheureusement pas comprit votre commande, voici toutes les commandes dont je dispose :\nhttp://commandes.InvisibilityCloak.umontp.fr").queue();
        else
            try {
                execute(messageSplit[1], messageSplit[2], messageRecue.getAuthor());
            } catch (UtilisateurAFaitUneMauvaiseCommandeException e) {
                messageRecue.getChannel().sendMessage(e.getMessage()).queue();
            }
    }

    void execute(String textChannel, String message, User user) throws UtilisateurAFaitUneMauvaiseCommandeException;
}
