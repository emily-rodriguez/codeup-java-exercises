package cardgames;

import util.Input;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static cardgames.Card.getCard;
import static cardgames.Card.getCardName;

public class GameOfWar {
    public static Input input = new Input();
    public static Card[] cards = CardsArray.getAllCards();
    public static Player player1;
    public static Player player2 = new Player("Computer");
    public static int gameCount = 0;

    public static Card[] shuffleDeck(Card[] cards){
        Random shuffle = new Random();

        for (int i = 0; i < cards.length; i ++) {
            int randomPlace = shuffle.nextInt(cards.length);
            Card tempArray = cards[i];
            cards[i] = cards[randomPlace];
            cards[randomPlace] = tempArray;

        }
        return cards;
    }

    public static void playGame() {

        shuffleDeck(cards);

        player1 = new Player(input.getString("Welcome player one! Please enter a user name: "));

        for (int i = 0; i < cards.length - 1; i++) {
            Card player1Card = cards[i];
            Card player2Card = cards[i+=1];
            System.out.println(player1.name + "'s card: " + getCardName(player1Card) + " AND " + player2.name + "'s card: " + getCardName(player2Card));

            if (player1Card.value > player2Card.value) {
                System.out.println("Point to " + player1.name);
                player1.playerScore =+ 1;
            } else if (player2Card.value > player1Card.value) {
                System.out.println("Point to " + player2.name);
                player2.playerScore =+ 1;
            } else if (player2Card.value == player1Card.value) {
                System.out.println("WAR!");
            }
        }





    }


    public static void main(String[] args) {
        playGame();
    }
}
