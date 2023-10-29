package GoFishProject;
import java.util.List;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private String name;
    private List<Card> hand;
    private int hSetCounter;
    private int sets = 0;


    Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name, List<Card> hand, int sets) {
        this.name = name;
        this.hand = hand;
        hSetCounter = 0;
        this.sets = sets;
    }


    @Override
    public String getName() {
        return name;
    }
    public int getSetCounter() {
        return hSetCounter;
    }

    @Override
    public List<Card> getHand() {
        return hand;
    }

    @Override
    public int getSets(){
        return this.sets;
    }

    @Override
    public void setSets(int sets){
        this.sets += sets;
    }

    @Override
    public void addToHand(Card card) {
        hand.add(card);
    }

    public void removeFromHand(Card card) {
        hand.remove(card);
    }

    //until here coded by Chaya, play() coded by Shana
    @Override
    public Card play() {
        if (hand.isEmpty()) {
            System.out.println(getName() + ", you have no cards to play.");

        }

        // Print the player's hand
        System.out.println(getName() + ", your current hand:");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ". " + hand.get(i));
        }

        System.out.print("Enter the number of the card you want to play (1-" + hand.size() + "): ");
        int selectedCardIndex = scanner.nextInt() - 1;
        
       
        while (selectedCardIndex < 0 || selectedCardIndex >= hand.size()) {
            System.out.println("Invalid card selection. Please select a valid card.");
            System.out.print("Enter the number of the card you want to play (1-" + hand.size() + "): ");
            selectedCardIndex = scanner.nextInt() - 1;

        }

        Card cardToPlay = hand.get(selectedCardIndex);

        System.out.println(getName() + " asks for " + cardToPlay);

        return cardToPlay;

    }

    //coded by Chaya Kanevski
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
