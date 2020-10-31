package fr.umontpellier.iut.commandes;

import java.util.HashMap;

import fr.umontpellier.iut.commandes.send.SendById;
import fr.umontpellier.iut.commandes.send.SendByName;
import fr.umontpellier.iut.commandes.setpseudo.SetPseudoIDChannel;
import fr.umontpellier.iut.commandes.setpseudo.SetPseudoIDGuilde;
import fr.umontpellier.iut.commandes.setpseudo.SetPseudoNomChannel;
import fr.umontpellier.iut.commandes.setpseudo.SetPseudoNomGuilde;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

/**
 * <b>RepertoireCommandes est la classe qui répertorie toutes les commandes du
 * bot.</b>
 * <p>
 * Elle est caractérisée par :
 * <ul>
 * <li>Une {@code HashMap} qui associe un mot {@code String} à une
 * {@code Commande}</li>
 * </ul>
 * </p>
 * <p>
 * A noter que {@link #REPERTOIRE_DES_COMMANDES} est automatiquement initialisé
 * en static.
 * </p>
 * 
 * @see HashMap
 * @see Commande
 * 
 * @version 1.0
 */
public class RepertoireCommandes {

    /**
     * Répertoire des commandes. Ce repertoire relie le mot clé à une commande.
     * 
     * @see HashMap
     * @see Commande
     */
    private static final HashMap<String, Commande> REPERTOIRE_DES_COMMANDES = new HashMap<>();

    static {
        REPERTOIRE_DES_COMMANDES.put("help", new Help());
        REPERTOIRE_DES_COMMANDES.put("bug", new Bug());
        REPERTOIRE_DES_COMMANDES.put("bogue", new Bug());
        REPERTOIRE_DES_COMMANDES.put("invite", new Invite());
        REPERTOIRE_DES_COMMANDES.put("send", new SendByName());
        REPERTOIRE_DES_COMMANDES.put("sendbyname", new SendByName());
        REPERTOIRE_DES_COMMANDES.put("sendbyid", new SendById());
        REPERTOIRE_DES_COMMANDES.put("sendid", new SendById());
        REPERTOIRE_DES_COMMANDES.put("feed-back", new FeedBack());
        REPERTOIRE_DES_COMMANDES.put("feedback", new FeedBack());
        REPERTOIRE_DES_COMMANDES.put("setpseudo", new SetPseudoNomGuilde());
        REPERTOIRE_DES_COMMANDES.put("setpseudonomguilde", new SetPseudoNomGuilde());
        REPERTOIRE_DES_COMMANDES.put("setpseudoidguilde", new SetPseudoIDGuilde());
        REPERTOIRE_DES_COMMANDES.put("setpseudoidchannel", new SetPseudoIDChannel());
        REPERTOIRE_DES_COMMANDES.put("setpseudonomchannel", new SetPseudoNomChannel());
    }

    /**
     * Retourne la commande associée au message
     * 
     * @param msg {@code  MessageReceivedEvent} message reçue par un serveur Discord
     * 
     * @return {@code Commande}
     * 
     * @see RepertoireCommandes#REPERTOIRE_DES_COMMANDES
     * @see java.util.HashMap#get(java.lang.Object)
     * @see RepertoireCommandes#getPremierMotDuMessage(MessageReceivedEvent)
     */
    public static Commande getCommande(MessageReceivedEvent msg) {
        String motClef = getPremierMotDuMessage(msg);
        return REPERTOIRE_DES_COMMANDES.get(motClef);
    }

    /**
     * Retourne le premier mot contenue dans le message reçue du serveur
     * 
     * @param msg {@code MessageReceivedEvent} Message reçue du serveur
     * 
     * @return {@code String} premier mot du message
     * 
     * @see MessageReceivedEvent#getMessage()
     * @see net.dv8tion.jda.api.entities.Message#getContentRaw()
     */
    private static String getPremierMotDuMessage(MessageReceivedEvent msg) {
        return msg.getMessage().getContentRaw().substring(1).split(" ", 2)[0].toLowerCase();
    }

    private RepertoireCommandes() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * @param nomCommande
     * @return {@code Commande} associé au {@code String} donné en paramètre
     * @see java.util.HashMap#get(java.lang.Object)
     */
    public static Commande getCommande(String nomCommande) {
        if (nomCommande.charAt(0) == '!')
            nomCommande = nomCommande.substring(1);
        return REPERTOIRE_DES_COMMANDES.get(nomCommande);
    }

}