// Coded by Chaya Kanevski
package GoFishProject;
public class ImplementCard implements Card {
    //fields
    private String suit;
    private String rank;

    //constructor that initializes rand and suit of a card
    public ImplementCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //getters
    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }

    //toString method for display that returns a string
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(rank);
        return sb.toString();
    }
}
