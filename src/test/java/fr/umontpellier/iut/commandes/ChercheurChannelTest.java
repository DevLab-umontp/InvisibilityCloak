package fr.umontpellier.iut.commandes;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;
import fr.umontpellier.iut.commandes.send.SendById;
import fr.umontpellier.iut.outils.ChercheurChannel;

class ChercheurChannelTest {
    @Test
    void test_getTextChannel_with_IDNotValid_should_throws_IdInconnueException() {
        assertThrows(IDTextChannelFormatException.class, () -> ChercheurChannel.getTextChannelById("ID non valide", null));
    }
}
