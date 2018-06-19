package studyhall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class fibonacci {

    public static void main(String[] args) {
        int index = 0;
        while (index <= 20) {
            System.out.println(fibonacci(index));
            index++;
        }
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        long fibTerm = fibonacci(n - 1) + fibonacci(n - 2);
        return fibTerm;
    }
}
