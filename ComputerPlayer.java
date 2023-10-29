package GoFishProject;
import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {
    private String name;
    private List<Card> hand;
    private int sets = 0;

    public ComputerPlayer(String name, List<Card> hand, int sets) {
        this.name = name;
        this.hand = hand;
        this.sets = sets;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Card> getHand() {
        return hand;
    }

    @Override
    public void addToHand(Card card) {
        hand.add(card);
    }
    public void removeFromHand(Card card) {
        hand.remove(card);
    }

    @Override
    public int getSets(){
        return this.sets;
    }

    @Override
    public void setSets(int sets){
        this.sets += sets;
    }

    //until here coded by Chaya Kanevski.Play method coded by Shana Szanzer
    @Override
    public Card play() {
        //checking to see if the computer's hand is empty
        if (hand.isEmpty()) {
            System.out.println(getName() + " has no cards left to play.");

        }
        /* Print the player's hand FOR DEBUGGING PURPOSES ONLY
        System.out.println(getName() + ", your current hand:");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ". " + hand.get(i));
        } */

        // Choosing a random card to ask for from the computer's hand
        Random random = new Random();
        int index = random.nextInt(hand.size());
        Card cardToPlay = hand.get(index);


        System.out.println(getName() + " asks for a " + cardToPlay);

        return cardToPlay;
    }

    @Override
    public int checkForSets() {
        int sets = 0;
        int i = 0;
        while (i < hand.size()) {
            Card card = hand.get(i);
            int count = 0;
            for (int j = 0; j < hand.size(); j++) {
                if (hand.get(j).getRank().equals(card.getRank())) {
                    count++;
                }
            }
            if (count == 4) {
                // Remove the set of cards from the hand
                for (int j = hand.size() - 1; j >= 0; j--) {
                    if (hand.get(j).getRank().equals(card.getRank())) {
                        hand.remove(j);
                    }
                }
                sets++;
            } else {
                i++;
            }
        }
        return sets;
    }
}
