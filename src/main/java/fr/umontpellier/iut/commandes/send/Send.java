package fr.umontpellier.iut.commandes.send;

import fr.umontpellier.iut.bd.BaseDonnee;
import fr.umontpellier.iut.commandes.Commande;
import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

interface Send extends Commande {

    @Override
    default void execute(Message messageRecue) {
        String[] messageSplit = messageRecue.getContentRaw().split(" ", 3);
        User user = messageRecue.getAuthor();
        try {
            if (messageSplit.length != 3)
                throw new UtilisateurAFaitUneMauvaiseCommandeException(
                        "Je n'ai malheureusement pas compris votre commande, voici toutes les commandes dont je dispose :\nhttp://commandes.InvisibilityCloak.umontp.fr");
            TextChannel channel = getTextChannel(messageSplit[1], user);
            String pseudo = BaseDonnee.getPseudoSinonAttribuePseudoEtAvertieUser(channel, user);
            channel.sendMessage(pseudo + '\n' + messageSplit[2]).queue();
        } catch (UtilisateurAFaitUneMauvaiseCommandeException e) {
            messageRecue.getChannel().sendMessage(e.getMessage()).queue();
        }
    }

    TextChannel getTextChannel(String textChannel, User user) throws UtilisateurAFaitUneMauvaiseCommandeException;
}
