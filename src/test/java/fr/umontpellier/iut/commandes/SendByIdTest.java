package fr.umontpellier.iut.commandes;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.umontpellier.iut.commandes.exceptions.IDTextChannelFormatException;
import fr.umontpellier.iut.commandes.send.SendById;

class SendByIdTest {
    @Test
    void test_getTextChannel_with_IDNotValid_should_throws_IdInconnueException() {
        SendById send = new SendById();
        assertThrows(IDTextChannelFormatException.class, () -> send.getTextChannelById("ID non valide", null));
    }
}
