package fr.umontpellier.iut.commandes.send;

import fr.umontpellier.iut.commandes.exceptions.UtilisateurAFaitUneMauvaiseCommandeException;
import fr.umontpellier.iut.outils.ChercheurChannelMutuel;
import fr.umontpellier.iut.commandes.exceptions.NomChannelDoublonException;
import fr.umontpellier.iut.commandes.exceptions.NomChannelIntrouvableException;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class SendByName implements Send {
    private static final String MESSAGE_AIDE = "La commande SendByName s'utilise de cette manière :\n`!SendByName {Nom-du-channel} {Votre-message-annonyme}`\n";

    @Override
    public TextChannel getTextChannel(String nomTextChannel, User user)
            throws UtilisateurAFaitUneMauvaiseCommandeException {
        try {
            return ChercheurChannelMutuel.getTextChannelByName(nomTextChannel, user);
        } catch (NomChannelDoublonException | NomChannelIntrouvableException e) {
            throw new UtilisateurAFaitUneMauvaiseCommandeException(e.getMessage());
        }
    }

    @Override
    public String getMessageAide() {
        return MESSAGE_AIDE;
    }
}
