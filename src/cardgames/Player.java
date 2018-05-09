package cardgames;

public class Player {
    protected String name;
    protected int playerScore = 0;

    public Player() {};

    public Player(String name) {
        this.name = name;
    }

    public String getScore(Player player1, Player player2){
        return "Score: " + player1.name + ": " + player1.playerScore + " " + player2.name + ": " + player2.playerScore;
    }
}
