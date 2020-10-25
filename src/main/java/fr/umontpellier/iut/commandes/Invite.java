package fr.umontpellier.iut.commandes;

import net.dv8tion.jda.api.entities.Message;

/**
 * Commande Invite
 * 
 * @see Commande
 * 
 * @version 1.0
 */
public class Invite implements Commande {

    /**
     * Envoi le lien d'invitation du bot dans le channel où le message a été reçue.
     * 
     * @param messageRecue {@code Message}
     * 
     * @see Message#getChannel()
     * @see net.dv8tion.jda.api.entities.MessageChannel#sendMessage(CharSequence)
     */
    @Override
    public void execute(Message messageRecue) {
        String reponse = "Vous voulez m'inviter dans votre guilde? Cliquez sur le lien ci-dessous!\nhttp://invite.invisibility-cloak.umontp.fr/";
        messageRecue.getChannel().sendMessage(reponse).queue();
    }

}
