package fr.umontpellier.iut.commandes.exceptions;

public class NomGuildeIntrouvableException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 775030256191058850L;

    public NomGuildeIntrouvableException() {
        super("*Le nom de guilde renseigné n'a pas pus être trouvé essayer la commande `!setPseudoIdGuilde {ID-Guild}`.*");
    }
}
