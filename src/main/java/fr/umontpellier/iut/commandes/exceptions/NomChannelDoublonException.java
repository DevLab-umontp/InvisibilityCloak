package fr.umontpellier.iut.commandes.exceptions;

public class NomChannelDoublonException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 4679933246360729879L;

    /**
     */
    public NomChannelDoublonException() {
        super("Plusieurs channels du même nom on étaient trouvés, veuillez utiliser l'id du channel au lieu du nom.\nhttps://github.com/DevLab-umontp/InvisibilityCloak.umontp");
    }

}
