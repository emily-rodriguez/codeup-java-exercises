public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("While loop: ");

        int i = 5;
        while(i <= 15) {
            System.out.println(i);
            i++;
        }

        System.out.println("=======");
        System.out.println("Do While loop: ");

        int x = 2;
        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);

        System.out.println("=======");
        System.out.println("For loop: ");

        for (int n = 5; n <= 15; n++) {
            System.out.println(n);
        }

        System.out.println("=======");
        System.out.println("Second For loop: ");

        for (int a = 2; a <= 100; a += 2) {
            System.out.println(a);
        }

        System.out.println("=======");
        System.out.println("FizzBuzz: ");

        for (int b = 1; b <= 100; b++) {
            if (b % 3 == 0) {
                System.out.println("Fizz");
            } if (b % 5 == 0) {
                System.out.println("Buzz");
            } if ((b % 15 == 0)) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(b);
            }
        }

    }
}
