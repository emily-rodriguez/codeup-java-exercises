package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        boolean anotherCircle;

        do {

            System.out.print("Please enter the radius of your circle");

            Circle circle = new Circle(input.getDouble());

            System.out.println("The area of your circle is: " + circle.getArea());

            System.out.println("The circumference of your circle is: " + circle.getCircumference());

            System.out.println("You have made " + circle.getNumberOfCircles() + " circles");

            anotherCircle = input.yesNo("Would you like to make a circle?");

        } while (anotherCircle);


    }


}
