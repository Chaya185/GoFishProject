// Coded by Chaya Kanevski
package GoFishProject;
public class ImplementCard implements Card {
    private String suit;
    private String rank;

    public ImplementCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(rank);
        return sb.toString();
    }

}
