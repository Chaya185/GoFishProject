package GoFishProject;

import java.util.List;

public interface Player {
	//player fields
    	String getName();
    	List<Card> getHand();

	int getSets();
    	void setSets(int sets);
    	void addToHand(Card card);
    	Card play();
	void removeFromHand(Card card);
	int checkForSets();

}
