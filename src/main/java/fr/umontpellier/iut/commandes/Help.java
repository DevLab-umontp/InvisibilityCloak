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
    public static final String MESSAGE_AIDE = "**Commandes Invisibility Cloak :** \n\n◻ Commande principale : \n\n  🔹 `!send {nom-du-channel} {message}` : envoyer un message de manière annonyme sur le channel, en utilisant le nom du channel.\n  🔹 `!sendById {ID-du-channel} {message}` : envoyer un message de manière annonyme sur le channel, en utilisant l'ID du channel.\n  🔹 `!setPseudo {nom-du-serveur}` : permet d'avoir un nouveau pseudonyme sur le serveur.\n  🔹 `!setPseudoById {ID-du-serveur}` : permet d'avoir un nouveau pseudonyme sur le serveur, en utilisant l'ID du serveur.\n\n◻ Commande secondaire :\n\n  🔹 `!help` : avoir un apperçu des commandes.\n  🔹 `!feed-back` : faire un retour sur le bot.\n  🔹 `!invite` : pour recevoir le lien pour inviter le bot sur un serveur discord.\n  🔹 `!bug` : faire le retour sur un bug rencontré avec le bot.\n\n Pour avoir de plus amples détails sur une commande : `!help {nom-de-la-commande}` \n<https://devlab.umontp.fr/InvisibilityCloak>";

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
        String reponse = MESSAGE_AIDE;
        String[] messageSplit = messageRecue.getContentRaw().split(" ", 2);
        if (messageSplit.length == 2) {
            Commande commande = RepertoireCommandes.getCommande(messageSplit[1]);
            if (commande != null)
                reponse = commande.getMessageAide();
        }
        messageRecue.getChannel().sendMessage(reponse).queue();
    }

}
