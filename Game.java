package GoFishProject;

public interface Game {
	void startGame();
    boolean isGameOver();
    void playTurn(Player player);
    void endGame();
}
