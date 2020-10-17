package fr.umontpellier.iut.commandes;

import net.dv8tion.jda.api.entities.Message;

/**
 * Commande Help
 * 
 * @see Commande
 * 
 * @version 1.0
 */
public class Help implements Commande {

    /**
     * Envoi un message dans le channel où le message a été reçue.
     * 
     * @param messageRecue {@code Message}
     * 
     * @see Message#getChannel()
     * @see net.dv8tion.jda.api.entities.MessageChannel#sendMessage(CharSequence)
     */
    @Override
    public void execute(Message messageRecue) {
        String reponse = "**Commandes Invisibility Cloak :**\nhttps://github.com/DevLab-umontp/InvisibilityCloak.umontp";
        messageRecue.getChannel().sendMessage(reponse).queue();
    }

}
