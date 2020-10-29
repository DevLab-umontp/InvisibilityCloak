package fr.umontpellier.iut.commandes.exceptions;

public class NomGuildeDoublonException extends Exception {
    /**
    *
    */
    private static final long serialVersionUID = -8757392971819489115L;

    /**
     */
    public NomGuildeDoublonException() {
        super("Plusieurs guildes du même nom ont été trouvés, veuillez utiliser l'id du la guilde avec la commande `!setPseudoIdGuilde {id-guild}` au lieu du nom.\nhttp://commandes.invisibilitycloak.umontp.fr");
    }
}
