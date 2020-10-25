package fr.umontpellier.iut.commandes;

import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelDoublonException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelIntrouvableException;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class SendByName implements Send {

    @Override
    public void execute(String textChannelInput, String message, User user)
            throws UtilisateurAFaitUneMauvaiseCommandeException {
        try {
            TextChannel textChannel = getTextChannelByName(textChannelInput, user);
            textChannel.sendMessage(message).queue();
        } catch (NomChannelDoublonException | NomChannelIntrouvableException e) {
            throw new UtilisateurAFaitUneMauvaiseCommandeException(e.getMessage());
        }
    }

    public TextChannel getTextChannelByName(String nomChannel, User user)
            throws NomChannelDoublonException, NomChannelIntrouvableException {
        for (Guild guild : user.getMutualGuilds()) {
            TextChannel[] textChannel = guild.getTextChannelsByName(nomChannel, true).toArray(new TextChannel[0]);
            if (textChannel.length != 0) {
                if (textChannel.length == 1)
                    return textChannel[0];
                else
                    throw new NomChannelDoublonException();
            }
        }
        if (nomChannel.charAt(0) == '#') // Gestion du cas où l'utilisateur utilise malencontreusement le # dans le nom du channel
            getTextChannelByName(nomChannel.substring(1), user);
        throw new NomChannelIntrouvableException();
    }
    // TODO gérer l'exception où l'on trouve le même nom de channel sur plusieurs
    // serveur différents

}
