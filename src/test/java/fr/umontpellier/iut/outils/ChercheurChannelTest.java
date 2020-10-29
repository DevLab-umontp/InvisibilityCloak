package fr.umontpellier.iut.outils;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;

class ChercheurChannelTest {
    @Test
    void test_getTextChannel_with_IDNotValid_should_throws_IdInconnueException() {
        assertThrows(IDTextChannelFormatException.class, () -> ChercheurChannelMutuel.getTextChannelAvecId("ID non valide", null));
    }
}
