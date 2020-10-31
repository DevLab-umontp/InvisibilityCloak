package fr.umontpellier.iut.commandes.setpseudo;

import fr.umontpellier.iut.commandes.exceptions.NomChannelDoublonException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelIntrouvableException;
import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import fr.umontpellier.iut.outils.ChercheurChannelMutuel;
import net.dv8tion.jda.api.entities.User;

public class SetPseudoNomChannel implements SetPseudo {
    private static final String MESSAGE_AIDE = "La commande SetPseudoNomChannel s'utilise de cette manière :\n`!SetPseudoNomChannel {Nom-du-channel}`\n";

    @Override
    public long getIdGuild(String nomTextChannel, User user) throws UtilisateurAFaitUneMauvaiseCommandeException {
        try {
            return ChercheurChannelMutuel.getTextChannelByName(nomTextChannel, user).getGuild().getIdLong();
        } catch (NomChannelDoublonException | NomChannelIntrouvableException e) {
            throw new UtilisateurAFaitUneMauvaiseCommandeException(e.getMessage());
        }
    }

    @Override
    public String getMessageAide() {
        return MESSAGE_AIDE;
    }
}
