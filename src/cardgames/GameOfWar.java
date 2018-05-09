package cardgames;

import util.Input;

import java.util.Random;

import static cardgames.Card.getCardName;

public class GameOfWar {
    public static Input input = new Input();
    public static Card[] cards = CardsArray.getAllCards();
    public static Player player1;
    public static Player player2 = new Player("Computer");
    public static Card player1Card;
    public static Card player2Card;
    public static int i;
    public static int cardsInLimbo =0;

    public static void main(String[] args) {
        playGame();
    }

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

    public static void warFaceoff(){
        System.out.println("WAR!!!!!");
        player1Card = cards[i += 2];
        player2Card = cards[i += 2];
        System.out.println(player1.name + "'s card: " + getCardName(player1Card) + " AND " + player2.name + "'s card: " + getCardName(player2Card));
        if (player1Card.value > player2Card.value) {
            System.out.println("Points to " + player1.name);
            player1.playerScore += 6;
            player1.playerScore += cardsInLimbo;
            System.out.println(player1.getScore(player1,player2));
        } else if (player2Card.value > player1Card.value) {
            System.out.println("Points to " + player2.name);
            player2.playerScore += 6;
            player2.playerScore += cardsInLimbo;
            System.out.println(player1.getScore(player1,player2));
        } else if (player1Card.value == player2Card.value){
            cardsInLimbo += 4;
            warFaceoff();
        }
    }

    public static void playGame() {
        shuffleDeck(cards);

        player1 = new Player(input.getString("Welcome player one! Please enter a user name: "));

        for (i = 0; i < cards.length; i++) {
            player1Card = cards[i];
            player2Card = cards[i+=1];
            System.out.println(player1.name + "'s card: " + getCardName(player1Card) + " AND " + player2.name + "'s card: " + getCardName(player2Card));

            if (player1Card.value > player2Card.value) {
                System.out.println("Point to " + player1.name);
                player1.playerScore += 2;
                System.out.println(player1.getScore(player1,player2));
            } else if (player2Card.value > player1Card.value) {
                System.out.println("Point to " + player2.name);
                player2.playerScore += 2;
                System.out.println(player1.getScore(player1,player2));
            } else if (player2Card.value == player1Card.value) {
                if (i >= 46) {
                    System.out.println("Not enough cards for WAR.");
                    player1.playerScore +=1;
                    player2.playerScore +=1;
                    System.out.println(player1.getScore(player1,player2));
                } else {
                    warFaceoff();
                }
            }
        }

        System.out.println(player1.name + "'s score: " + player1.playerScore);
        System.out.println(player2.name + "'s score: " + player2.playerScore);

        if (player1.playerScore > player2.playerScore) {
            System.out.println("You win " + player1.name + "!");
        } else if (player2.playerScore > player1.playerScore){
            System.out.println("You win " + player2.name + "!");
        } else {
            System.out.println("It's a tie!");
        }
        System.out.println("___$$_____$$______$$$_________$$$_____$$$$$$$_______$$$____$$_____$$__");
        System.out.println("___$$_____$$____$$___$$_____$$___$$___$$_____$$____$___$____$$___$$___");
        System.out.println("___$$_____$$___$$_____$$___$$_____$$__$$_____$$___$$___$$____$$_$$____");
        System.out.println("___$$$$$$$$$___$$_____$$___$$_____$$__$$$$$$$____$$$$$$$$$_____$$_____");
        System.out.println("___$$_____$$___$$_____$$___$$_____$$__$$___$$____$$_____$$_____$$_____");
        System.out.println("___$$_____$$____$$___$$_____$$___$$___$$____$$___$$_____$$_____$$_____");
        System.out.println("___$$_____$$______$$$_________$$$_____$$_____$$__$$_____$$_____$$_____");
    }

}
