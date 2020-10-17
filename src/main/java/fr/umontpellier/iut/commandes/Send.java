package fr.umontpellier.iut.commandes;

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
        } catch (IdTextChannelInconnueException e) {
            messageRecue.getChannel().sendMessage(e.getMessage()).queue();
        }
    }

    public TextChannel getTextChannel(String idChannel, User user) throws IdTextChannelInconnueException {
        try {
            long id = Long.parseLong(idChannel);
            for (Guild guild : user.getMutualGuilds()) {
                TextChannel textChannel = guild.getTextChannelById(id);
                if (textChannel != null)
                    return textChannel;
            }
        } catch (NumberFormatException n) {
            throw new IdTextChannelInconnueException("*L'ID du channel renseigné ne doit comporter que des chiffres.*");
        }
        throw new IdTextChannelInconnueException("*l'ID du channel n'a pas pus être trouvé dans les serveurs que nous avons en commun*");

    }

}
