package shapes;

public class Circle {
    private static int numberOfCircles = 0;
    private double radius;
    private double pi = Math.PI;

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

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

}