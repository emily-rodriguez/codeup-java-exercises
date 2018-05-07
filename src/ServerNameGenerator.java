import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"angry","bored","happy","sad","big","small","beautiful","ugly","quiet","loud"};

    public static String[] nouns = {"woman","man","dog","cat","house","ocean","mountain","banana","book","peacock"};

    public static String getRandom(String[] array) {
        String randomWord = array[new Random().nextInt(array.length)];
        return randomWord;
    }

    public static void main(String[] args) {

        System.out.println("Here is your server name:");
        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));

    }

}
