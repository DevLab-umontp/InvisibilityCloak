package fr.umontpellier.iut.commandes.send;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;
import fr.umontpellier.iut.commandes.exceptions.IDTextChannelIntrouvableException;
import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import fr.umontpellier.iut.outils.ChercheurChannelMutuel;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class SendById implements Send {

    @Override
    public TextChannel getTextChannel(String idTextChannel, User user)
            throws UtilisateurAFaitUneMauvaiseCommandeException {
        try {
            return ChercheurChannelMutuel.getTextChannelAvecId(idTextChannel, user);
        } catch (IDTextChannelFormatException | IDTextChannelIntrouvableException e) {
            throw new UtilisateurAFaitUneMauvaiseCommandeException(e.getMessage());
        }
    }

}
