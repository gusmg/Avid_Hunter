/*
 * The Avid Hunter
 * This simple RPG is designed to give a new gamer a basic idea of a crafting RPG, first hand.
 * The simple goal is to hunt wild animals, clean them, and create a basic armor set from the hides
 * gathered. The player can continue to a couple more advanced suits of armor if they desire as well
 * as taking advantage of extra crafting processes to cut down shop costs for crafting the suit of
 * armor. You can garden and boil the vegetables for oil to tan the hides with, and collect cotton
 * to spin into thread.
 */
package avid_hunter;

import byui.cit260.avid_hunter.model.Player;

/**
 *
 * @author C§
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Player NewGuy = new Player();
    
    NewGuy.setName("Hannibal Lector");
    
    String NewGuysStats = NewGuy.toString();
    System.out.println(NewGuysStats);
    }
}
