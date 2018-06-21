import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Interview {
    public static void main(String[] args) throws IOException {
//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader); String line;
//        while ((line = in.readLine()) != null)
//        {
//            System.out.println(line);
//        }
        System.out.println(minimumCoins(20));
    }

    public static int minimumCoins(int total) {
        int coin5count = total / 5;
        int coin3count = (total - coin5count * 5)/3;
        int coin1count = (total - (coin5count*5) - (coin3count*3))/1;
        int minimumCoinsUsed = (coin5count + coin3count + coin1count);
        return minimumCoinsUsed;
    }

    public static int minimumCoins2(int total) {
        if (total == 0) {
            return 0;
        }

        int result = Integer.MAX_VALUE;

        int coins[] = {1,3,5};

        for(int i = 0; i<coins.length; i++) {
            if (coins[i] <= total) {
                int minResult = minimumCoins(total - coins[i]);

                if (minResult != Integer.MAX_VALUE && minResult + 1 < result) {
                    result = minResult + 1;
                }
            }
        }
        return result;
    }

}
