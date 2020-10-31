package fr.umontpellier.iut.commandes.setpseudo;

import fr.umontpellier.iut.commandes.exceptions.IDGuildeFormatException;
import fr.umontpellier.iut.commandes.exceptions.IDGuildeIntrouvableException;
import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import fr.umontpellier.iut.outils.ChercheurGuildeMutuelle;
import net.dv8tion.jda.api.entities.User;

public class SetPseudoIDGuilde implements SetPseudo {
    private static final String MESSAGE_AIDE = "La commande SetPseudoId s'utilise de cette manière :\n`!SetPseudoIdG {ID-du-Serveur}`\n"
            + ChercheurGuildeMutuelle.MESSAGE_AIDE_ID_GUILDE;

    @Override
    public long getIdGuild(String idGuild, User user) throws UtilisateurAFaitUneMauvaiseCommandeException {
        try {
            return ChercheurGuildeMutuelle.getGuildeMutelleAvecIdGuilde(idGuild, user).getIdLong();
        } catch (IDGuildeIntrouvableException | IDGuildeFormatException e) {
            throw new UtilisateurAFaitUneMauvaiseCommandeException(e.getMessage());
        }
    }

    @Override
    public String getMessageAide() {
        return MESSAGE_AIDE;
    }
    
}
