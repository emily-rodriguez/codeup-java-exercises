package studyhall;

import util.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class studyhalltest {

    public static void reader() {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        try {
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong", e);
        }
    }


    public static int numberOfCoins(Integer[] coins, int number) {
        int a = coins[0];
        int b = coins[1];
        int c = coins[2];
        int numOfaCoins = number/a;
        int numOfbCoins = (number - (numOfaCoins * a)) / b;
        int numOfcCoins = (number - (numOfaCoins * a) - (numOfbCoins * b))/c;
        int minNumberOfCoins = (numOfaCoins + numOfbCoins + numOfcCoins);
        return minNumberOfCoins;
    }

    public static void printTriagle(int n)
        {
        // number of spaces
        int k = 2*n - 2;

        for (int i=1; i<=n; i++) {
            for (int j=0; j<k; j++) {
                System.out.print(" ");
            }
            k = k - 1;
            for (int j=1; j<=i; j++ ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String x = scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        int n = 5;
//        printTriagle(n);


        int[] coins = {1,3,5};
        Integer[] integerList = new Integer[3];

        for (int a = 0; a < coins.length; a++) {
            integerList[a] = coins[a];
        }
        Arrays.sort(integerList, Collections.reverseOrder());

        for(Integer number: integerList) {
            System.out.println(number);
        }
//        System.out.println(findMinCoins(coins, 20));

        System.out.println(numberOfCoins(integerList,11));
    }
}
