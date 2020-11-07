package fr.umontpellier.iut.outils;

import fr.umontpellier.iut.commandes.exceptions.IDGuildeFormatException;
import fr.umontpellier.iut.commandes.exceptions.IDGuildeIntrouvableException;
import fr.umontpellier.iut.commandes.exceptions.NomGuildeDoublonException;
import fr.umontpellier.iut.commandes.exceptions.NomGuildeIntrouvableException;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.User;

public class ChercheurGuildeMutuelle {
    public static final String MESSAGE_AIDE_ID_GUILDE = "Pour récupérer l'ID d'une guilde il suffit de faire un clic droit sur l'icone du serveur en question et cliquer sur \"Copier l'ID\"";

    public static Guild getGuildeMutelleAvecIdGuilde(String designasionGuild, User user)
            throws IDGuildeIntrouvableException, IDGuildeFormatException {
        try {
            long idGuild = Long.parseLong(designasionGuild);
            for (Guild guild : user.getMutualGuilds())
                if (idGuild == guild.getIdLong())
                    return guild;
            throw new IDGuildeIntrouvableException();
        } catch (NumberFormatException e) {
            throw new IDGuildeFormatException();
        }
    }

    public static Guild getGuildeMutuelleAvecNomGuilde(String designasionGuild, User user)
            throws NomGuildeDoublonException, NomGuildeIntrouvableException {
        Guild guildeTrouve = null;
        for (Guild guild : user.getMutualGuilds()) {
            if (designasionGuild.equals(guild.getName())) {
                if (guildeTrouve == null)
                    guildeTrouve = guild;
                else
                    throw new NomGuildeDoublonException();
            }
        }
        if (guildeTrouve != null)
            return guildeTrouve;
        throw new NomGuildeIntrouvableException();
    }

    private ChercheurGuildeMutuelle() {
        throw new IllegalStateException("Utility class");
    }
}
