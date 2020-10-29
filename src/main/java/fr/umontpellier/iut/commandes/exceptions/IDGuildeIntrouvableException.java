package fr.umontpellier.iut.commandes.exceptions;

public class IDGuildeIntrouvableException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 775030256191058850L;

    /**
     */
    public IDGuildeIntrouvableException() {
        super("*l'ID de guilde donné n'a pas pus être trouvé dans les serveurs que nous avons en commun*");
    }
}
