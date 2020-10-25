package fr.umontpellier.iut.commandes;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;
import fr.umontpellier.iut.commandes.exceptions.IDTextChannelNonTrouveException;
import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class SendById implements Send {

    @Override
    public void execute(String textChannelInput, String message, User user) throws UtilisateurAFaitUneMauvaiseCommandeException {
        try {
            TextChannel textChannel = getTextChannelById(textChannelInput, user);
            textChannel.sendMessage(message).queue();
        } catch (IDTextChannelFormatException | IDTextChannelNonTrouveException e) {
            throw new UtilisateurAFaitUneMauvaiseCommandeException(e.getMessage());
        }
    }

    public TextChannel getTextChannelById(String idChannel, User user)
            throws IDTextChannelFormatException, IDTextChannelNonTrouveException {
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
        throw new IDTextChannelNonTrouveException();
    }

}
