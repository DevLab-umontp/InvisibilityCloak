package fr.umontpellier.iut.outils;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.umontpellier.iut.commandes.exceptions.IDGuildeFormatException;

class ChercheurGuildMutelleTest {
    @Test
    void test_getTextChannel_with_IDNotValid_should_throws_IdInconnueException() {
        assertThrows(IDGuildeFormatException.class,
                () -> ChercheurGuildeMutuelle.getGuildeMutelleAvecIdGuilde("ID non valide", null));
    }
}
