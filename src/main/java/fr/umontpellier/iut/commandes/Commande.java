package fr.umontpellier.iut.commandes;

import net.dv8tion.jda.api.entities.Message;

/**
 * Commande
 */
public interface Commande {

    public void execute(Message messageRecue);
}