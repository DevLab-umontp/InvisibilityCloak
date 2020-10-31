package fr.umontpellier.iut.commandes.setpseudo;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;
import fr.umontpellier.iut.commandes.exceptions.IDTextChannelIntrouvableException;
import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import fr.umontpellier.iut.outils.ChercheurChannelMutuel;
import net.dv8tion.jda.api.entities.User;

public class SetPseudoIDChannel implements SetPseudo {
    private static final String MESSAGE_AIDE = "La commande SetPseudoIdChannel s'utilise de cette manière :\n`!SetPseudoIdChannel {ID-du-channel}`\n"
            + ChercheurChannelMutuel.MESSAGE_AIDE_ID_CHANNEL;

    @Override
    public long getIdGuild(String idChannel, User user) throws UtilisateurAFaitUneMauvaiseCommandeException {
        try {
            return ChercheurChannelMutuel.getTextChannelAvecId(idChannel, user).getGuild().getIdLong();
        } catch (IDTextChannelFormatException | IDTextChannelIntrouvableException e) {
            throw new UtilisateurAFaitUneMauvaiseCommandeException(e.getMessage());
        }
    }

    @Override
    public String getMessageAide() {
        return MESSAGE_AIDE;
    }

}
