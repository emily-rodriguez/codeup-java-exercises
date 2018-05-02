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
