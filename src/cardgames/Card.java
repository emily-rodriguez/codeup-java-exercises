package cardgames;

public class Card {
    protected String suit;
    protected String name;
    protected int value;

    public Card() {};

    public Card(String suit, String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }

    public static String getCardName(Card card){
        return card.name + " of " + card.suit;
    }
}
