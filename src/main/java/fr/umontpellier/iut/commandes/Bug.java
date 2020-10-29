package fr.umontpellier.iut.commandes;

import net.dv8tion.jda.api.entities.Message;

/**
 * Commande Bug
 * 
 * @see Commande
 * 
 * @version 1.0
 */
public class Bug implements Commande {

    /**
     * Envoi le lien redirigant à la création d'une issue, dans le channel où le
     * message a été reçue.
     * 
     * @param messageRecue {@code Message}
     * 
     * @see Message#getChannel()
     * @see net.dv8tion.jda.api.entities.MessageChannel#sendMessage(CharSequence)
     */
    @Override
    public void execute(Message messageRecue) {
        String reponse = "** Un bug ? Voici le lien pour en faire le retour :**\nhttp://bug.invisibilitycloak.umontp.fr";
        messageRecue.getChannel().sendMessage(reponse).queue();
    }

}
