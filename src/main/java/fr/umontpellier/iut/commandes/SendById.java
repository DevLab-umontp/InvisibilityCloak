package fr.umontpellier.iut.commandes;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;
import fr.umontpellier.iut.commandes.exceptions.IDTextChannelNonTrouve;
import fr.umontpellier.iut.commandes.exceptions.NeedInformationUserException;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class SendById implements Send {

    @Override
    public void execute(String textChannelInput, String message, User user) throws NeedInformationUserException {
        try {
            TextChannel textChannel = getTextChannelById(textChannelInput, user);
            textChannel.sendMessage(message).queue();
        } catch (IDTextChannelFormatException | IDTextChannelNonTrouve e) {
            throw new NeedInformationUserException(e.getMessage());
        }
    }

    public TextChannel getTextChannelById(String idChannel, User user)
            throws IDTextChannelFormatException, IDTextChannelNonTrouve {
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
        throw new IDTextChannelNonTrouve();
    }

}
