package fr.umontpellier.iut.commandes.exceptions;

public class IDTextChannelIntrouvableException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -5855121874921401146L;

    /**
     */
    public IDTextChannelIntrouvableException() {
        super("*l'ID du channel n'a pas pus être trouvé dans les serveurs que nous avons en commun*");
    }

}
