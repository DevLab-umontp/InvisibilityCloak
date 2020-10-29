package fr.umontpellier.iut.commandes.exceptions;

public class NomChannelDoublonException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 4679933246360729879L;

    /**
     */
    public NomChannelDoublonException() {
        super("Plusieurs channels du même nom ont été trouvés, veuillez utiliser l'id du channel avec la commande `!sendById` au lieu du nom.\nhttp://commandes.invisibilitycloak.umontp.fr");
    }

}
