package fr.umontpellier.iut.commandes.exceptions;

public class IDGuildeFormatException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -1025774867305806615L;

    public IDGuildeFormatException() {
        super("*L'ID de guilde renseigné ne doit comporter que des chiffres.*");
    }
}
