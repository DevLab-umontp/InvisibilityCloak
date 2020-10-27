package fr.umontpellier.iut.outils;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;
import fr.umontpellier.iut.commandes.exceptions.IDTextChannelIntrouvableException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelDoublonException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelIntrouvableException;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class ChercheurChannel {

    public static TextChannel getTextChannelById(String idChannel, User user)
            throws IDTextChannelFormatException, IDTextChannelIntrouvableException {
        try {
            long id = Long.parseLong(idChannel);
            for (Guild guild : user.getMutualGuilds()) {
                TextChannel textChannel = guild.getTextChannelById(id);
                if (textChannel != null)
                    return textChannel;
            }
        } catch (NumberFormatException n) {
            throw new IDTextChannelFormatException();
        }
        throw new IDTextChannelIntrouvableException();
    }

    public static TextChannel getTextChannelByName(String nomChannel, User user)
            throws NomChannelDoublonException, NomChannelIntrouvableException {
        TextChannel textChannelTrouve = rechercheTextChannelCorrespondant(nomChannel, user);
        if (textChannelTrouve == null && nomChannel.charAt(0) == '#') // L'utilisateur a mit malencontreusement le #
                                                                      // devant le nom du channel
            textChannelTrouve = rechercheTextChannelCorrespondant(nomChannel.substring(1), user);
        if (textChannelTrouve != null)
            return textChannelTrouve;
        throw new NomChannelIntrouvableException();
    }

    private static TextChannel rechercheTextChannelCorrespondant(String nomChannel, User user)
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

    private ChercheurChannel() {
        throw new IllegalStateException("Utility class");
    }
}
