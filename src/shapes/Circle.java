package shapes;

public class Circle {
    private double radius;
    public double pi = Math.PI;
    private static int numberOfCircles = 0;

    public double makeCircle(double radius){
        return this.radius = radius;
    }


    public static int getNumberOfCircles() {
        return numberOfCircles;
    }


    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles++;
    }

    public double getArea() {
        double radiusSq = radius * radius;
        return pi * radiusSq;
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }

}