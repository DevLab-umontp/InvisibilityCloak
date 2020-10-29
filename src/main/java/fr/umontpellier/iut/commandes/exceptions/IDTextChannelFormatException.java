package fr.umontpellier.iut.commandes.exceptions;

public class IDTextChannelFormatException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -510127988136646975L;

    public IDTextChannelFormatException() {
        super("*L'ID du channel renseigné ne doit comporter que des chiffres.*");
    }
}
