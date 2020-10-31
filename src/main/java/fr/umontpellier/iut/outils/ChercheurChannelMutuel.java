package fr.umontpellier.iut.outils;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;
import fr.umontpellier.iut.commandes.exceptions.IDTextChannelIntrouvableException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelDoublonException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelIntrouvableException;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class ChercheurChannelMutuel {
    public static final String MESSAGE_AIDE_ID_CHANNEL = "Pour récupérer l'ID d'un channel il suffit de faire un clic droit sur l'onglet du channel en question et cliquer sur \"Copier l'ID\"";

    public static TextChannel getTextChannelAvecId(String idChannel, User user)
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
        // L'utilisateur a oublier d'enlever le # devant le nom du channel
        if (textChannelTrouve == null && nomChannel.charAt(0) == '#')
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

    private ChercheurChannelMutuel() {
        throw new IllegalStateException("Utility class");
    }
}
