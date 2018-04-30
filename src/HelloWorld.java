public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.print("Hello, ");
        System.out.print("World");
        int myFavoriteNumber = 10;
        System.out.println();
        System.out.println("My favorite number is " + myFavoriteNumber);
        String myString = "I have two dogs";
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        x = 5;
        System.out.println(++x);
        System.out.println(x);
        x = 4;
        x += 5;
        System.out.println(x);
        x = 3;
        int y = 4;
        y *= x;
        System.out.println(y);
        x = 10;
        y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
    }
}
