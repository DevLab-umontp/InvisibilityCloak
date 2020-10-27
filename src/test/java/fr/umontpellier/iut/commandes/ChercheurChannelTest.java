package fr.umontpellier.iut.commandes;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;
import fr.umontpellier.iut.outils.ChercheurChannelMutuel;

class ChercheurChannelTest {
    @Test
    void test_getTextChannel_with_IDNotValid_should_throws_IdInconnueException() {
        assertThrows(IDTextChannelFormatException.class, () -> ChercheurChannelMutuel.getTextChannelAvecId("ID non valide", null));
    }
}
