package fr.umontpellier.iut.commandes;

import fr.umontpellier.iut.commandes.exceptions.NomChannelDoublonException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelIntrouvableException;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class Send implements Commande {

    @Override
    public void execute(Message messageRecue) {
        String[] messageSplit = messageRecue.getContentRaw().split(" ", 3);
        try {
            TextChannel textChannel = getTextChannel(messageSplit[1], messageRecue.getAuthor());
            String messageText = messageSplit[2];
            textChannel.sendMessage(messageText).queue();
        } catch (NomChannelDoublonException | NomChannelIntrouvableException e) {
            messageRecue.getChannel().sendMessage(e.getMessage()).queue();
        }
    }

    public TextChannel getTextChannel(String nomChannel, User user)
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
        throw new NomChannelIntrouvableException();
    }
    // TODO gérer l'exception où l'on trouve le même nom de channel sur plusieurs
    // serveur différents

}
