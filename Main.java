// Coded by Shana Szanzer
package GoFishProject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int sets = 0;
        // Create the deck and players
        Deck deck = new ImplementDeck();
        List<Player> players = new ArrayList<>();
        
        // Create human and computer players
        List<Card> humanHand = new ArrayList<>();
        List<Card> computerHand = new ArrayList<>();
        
        Player humanPlayer = new HumanPlayer("Player", humanHand, sets);
        Player computerPlayer = new ComputerPlayer("Computer", computerHand, sets);
        
        players.add(humanPlayer);
        players.add(computerPlayer);
        
        // Create and start the game
        GoFishGame game = new GoFishGame(players, deck);
        game.startGame();
    }
}

