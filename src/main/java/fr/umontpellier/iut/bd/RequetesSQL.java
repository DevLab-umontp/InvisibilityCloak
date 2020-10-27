package fr.umontpellier.iut.bd;

import fr.umontpellier.iut.GestionnairePseudonyme;

class RequetesSQL {

    private RequetesSQL() {
        throw new IllegalStateException("Utility class");
    }

    private static final String SELECT_INDEX_PSEUDO = "SELECT indexPseudo FROM Pseudos WHERE idUser = %s AND idGuild = %s;";
    private static final String RECUPERE_PSEUDO_NON_UTILISE = "CALL recupere_pseudo_non_utilise(%s);";
    private static final String INSERT_INTO_PSEUDOS = "INSERT INTO Pseudos(idUser,iGuild,indexPseudo) VALUES(%s,%s,%s);";
    private static final String DELETE_ROW_WHERE = "DELETE FROM Pseudos WHERE idUser=%s AND idGuild = %s;";

    static final String DROP_TABLE_PSEUDOS = "DROP TABLE PSEUDO;";
    static final String CREATE_TABLE_PSEUDOS = "CREATE TABLE Pseudos( indexPseudo INT(3), CONSTRAINT pk_Pseudos PRIMARY KEY (indexPseudo) );";
    static final String INIT_TABLE_PSEUDOS = String.format("CALL INIT_PSEUDOS(%s);",
            GestionnairePseudonyme.getNbHarryPotterPersonnages());

    static String insertIntoTablePseudos(long idUser, long idGuild, int indexPseudo) {
        return String.format(INSERT_INTO_PSEUDOS, idUser, idGuild, indexPseudo);
    }

    static String recuperePseudoNonUtilise(long idGuild) {
        return String.format(RECUPERE_PSEUDO_NON_UTILISE, idGuild);
    }

    static String selectIndexPseudo(long idUser, long idGuild) {
        return String.format(SELECT_INDEX_PSEUDO, idUser, idGuild);
    }

    static String deleteAffection(long idUser, long idGuild) {
        return String.format(RequetesSQL.DELETE_ROW_WHERE, idUser, idGuild);
    }
}
