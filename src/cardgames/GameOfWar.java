package cardgames;

import util.Input;

import java.util.Random;

import static cardgames.Card.getCardName;

public class GameOfWar {
    public static void main(String[] args) {
        playGame();
    }

    public static Input input = new Input();
    public static Card[] cards = CardsArray.getAllCards();
    public static Player player1;
    public static Player player2;
    public static Card player1Card;
    public static Card player2Card;
    public static int i;
    public static int cardsInLimbo =0;


    public static Card[] shuffleDeck(Card[] cards){ //move to cardsarray class
        Random random = new Random();

        for (int i = 0; i < cards.length; i ++) {
            int randomPlace = random.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[randomPlace];
            cards[randomPlace] = temp;
        }
        return cards;
    }

    public static void warFaceoff(){
        System.out.println("WAR!!!!!");
        player1Card = cards[i += 2];
        player2Card = cards[i += 2];
        System.out.println(player1.name + "'s card: " + getCardName(player1Card) + " AND " + player2.name + "'s card: " + getCardName(player2Card));
        if (player1Card.value > player2Card.value) {
            System.out.println("War points to " + player1.name + "!");
            player1.playerScore += 6;
            player1.playerScore += cardsInLimbo;
            System.out.println(player1.getScore(player1,player2));
        } else if (player2Card.value > player1Card.value) {
            System.out.println("War points to " + player2.name + "!");
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
        player2 = new Player(input.getString("Welcome player two! Please enter a user name: "));

        for (i = 0; i < cards.length; i++) {
            player1Card = cards[i];
            player2Card = cards[i+=1];
            System.out.println(player1.name + "'s card: " + getCardName(player1Card) + " AND " + player2.name + "'s card: " + getCardName(player2Card));

            if (player1Card.value > player2Card.value) {
                System.out.println("2 points to " + player1.name + "!");
                player1.playerScore += 2;
                System.out.println(player1.getScore(player1,player2));
            } else if (player2Card.value > player1Card.value) {
                System.out.println("2 points to " + player2.name + "!");
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
        System.out.println("             ___________");
        System.out.println("            '._==_==_=_.'");
        System.out.println("            .-\\       /-.");
        System.out.println("           | (|  .=.  |) |");
        System.out.println("            '-| {{1}} |-'");
        System.out.println("              \\  /|\\  /");
        System.out.println("               '.   .'");
        System.out.println("                 ) (");
        System.out.println("               _.' '._");
        System.out.println("              `\"\"\"\"\"\"\"`");
    }

}
