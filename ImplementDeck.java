// Coded by Chaya Kanevski
package GoFishProject;
import java.util.*;

public class ImplementDeck implements Deck{
    private List<Card> cards;

    public ImplementDeck(){
        initializeDeck();
    }

    //this method creates a new deck
    private void initializeDeck(){
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String rank : ranks){
            	cards.add(new ImplementCard(rank, suit));
            }
        }
    }

    @Override
    //the drawCard method removes the top card from the deck if the deck is not empty
    public Card drawCard(){
        if (!cards.isEmpty()){
            return cards.remove(0);
        }
        return null;
    }

    @Override
    //shuffles the deck
    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    //checks if the deck is empty and returns true or false 
    public Boolean isEmpty(){
        if (cards.size() == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
