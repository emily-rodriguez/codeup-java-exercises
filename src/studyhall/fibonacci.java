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
//        int index = 0;
//        while (index <= 20) {
//            System.out.println(fibonacci(index));
//            index++;
//        }
//        System.out.println(fibonacci2(5));
//        System.out.println(fibonacci(5));
//        System.out.println(fibonacci2(12));
//        System.out.println(fibonacci(12));

        timesTable(100);

//        int a = 1;
//        int b = 2;
//        System.out.println(a);
//        System.out.println(b);
//
//        a = 2;
//        b = 1;
//        System.out.println(a);
//        System.out.println(b);
    }

//    public static long fibonacci(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n <= 2) {
//            return 1;
//        }
//        long fibTerm = fibonacci(n - 1) + fibonacci(n - 2);
//        return fibTerm;
//    }

    public static long fibonacci2(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci2(n-1) + fibonacci2(n-2);
    }

    public static void timesTable(int n){
//        for(int i = 1; i <= 10; i++ ){
//            System.out.println(n*i);

        for(int i = 0; i<n; i++){
                System.out.println(i-n);
        }


    }


}
