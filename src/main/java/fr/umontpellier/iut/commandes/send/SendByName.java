package fr.umontpellier.iut.commandes.send;

import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import fr.umontpellier.iut.outils.ChercheurChannel;
import fr.umontpellier.iut.commandes.exceptions.NomChannelDoublonException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelIntrouvableException;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class SendByName implements Send {

    @Override
    public TextChannel getTextChannel(String nomTextChannel, User user)
            throws UtilisateurAFaitUneMauvaiseCommandeException {
        try {
            return ChercheurChannel.getTextChannelByName(nomTextChannel, user);
        } catch (NomChannelDoublonException | NomChannelIntrouvableException e) {
            throw new UtilisateurAFaitUneMauvaiseCommandeException(e.getMessage());
        }
    }

}
