package fr.umontpellier.iut.commandes.setpseudo;

import fr.umontpellier.iut.commandes.exceptions.NomGuildeDoublonException;
import fr.umontpellier.iut.commandes.exceptions.NomGuildeIntrouvableException;
import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import fr.umontpellier.iut.outils.ChercheurGuildeMutuelle;
import net.dv8tion.jda.api.entities.User;

public class SetPseudoNomGuilde implements SetPseudo {

    @Override
    public long getIdGuild(String nomGuilde, User user) throws UtilisateurAFaitUneMauvaiseCommandeException {
        try {
            return ChercheurGuildeMutuelle.getGuildeMutuelleAvecNomGuilde(nomGuilde, user).getIdLong();
        } catch (NomGuildeDoublonException | NomGuildeIntrouvableException e) {
            throw new UtilisateurAFaitUneMauvaiseCommandeException(e.getMessage());
        }
    }
}
