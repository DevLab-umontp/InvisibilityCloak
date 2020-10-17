package fr.umontpellier.iut.commandes;

public class NomChannelIntrouvableException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 6253256850051595280L;

    /**
     */
    public NomChannelIntrouvableException() {
        super("*Le nom du channel n'a pas pus être trouvé dans les serveurs que nous avons en commun*");
    }


    
    
}
