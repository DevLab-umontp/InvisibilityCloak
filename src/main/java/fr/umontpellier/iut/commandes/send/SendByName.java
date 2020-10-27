package fr.umontpellier.iut.commandes.send;

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
        TextChannel textChannelTrouve = rechercheTextChannelCorrespondant(nomChannel, user);
        if (textChannelTrouve == null && nomChannel.charAt(0) == '#') // L'utilisateur a mit malencontreusement le # devant le nom du channel
            textChannelTrouve = rechercheTextChannelCorrespondant(nomChannel.substring(1), user);
        if (textChannelTrouve != null)
            return textChannelTrouve;
        throw new NomChannelIntrouvableException();
    }

    private TextChannel rechercheTextChannelCorrespondant(String nomChannel, User user)
            throws NomChannelDoublonException {
        TextChannel textChannelTrouve = null;
        for (Guild guild : user.getMutualGuilds()) {
            TextChannel[] textChannels = guild.getTextChannelsByName(nomChannel, true).toArray(new TextChannel[0]);
            if (textChannels.length != 0) {
                if (textChannels.length == 1 && textChannelTrouve == null)
                    textChannelTrouve = textChannels[0];
                else
                    throw new NomChannelDoublonException();
            }
        }
        return textChannelTrouve;
    }

}
