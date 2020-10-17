package fr.umontpellier.iut.commandes;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SendTest {
    @Test
    void test_getTextChannel_with_IDNotValid_should_throws_IdInconnueException() {
        Send send = new Send();
        assertThrows(IdTextChannelInconnueException.class, () -> send.getTextChannel("ID non valide", null));
    }
}
