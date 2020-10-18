
package fr.umontpellier.iut.commandes;

import net.dv8tion.jda.api.entities.Message;

public class FeedBack implements Commande {

    @Override
    public void execute(Message messageRecue) {
        final String MESSAGE = "Une idée d'amélioration ? Un bug ? Voici le lien pour en faire le retour : https://github.com/DevLab-umontp/InvisibilityCloak.umontp/issues/new";
        messageRecue.getChannel().sendMessage(MESSAGE).queue();
    }
}