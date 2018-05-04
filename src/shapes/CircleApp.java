package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();


        do {

            System.out.print("Please enter the radius of your circle");

            Circle circle = new Circle(input.getDouble());

            System.out.println("The area of your circle is: " + circle.getArea());

            System.out.println("The circumference of your circle is: " + circle.getCircumference());

            System.out.println("Do you want to enter another circle?");

        } while (input.yesNo());

        System.out.println("You made " + Circle.getNumberOfCircles() + " circles.");

    }


}
