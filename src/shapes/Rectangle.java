package shapes;

public class Rectangle {
    protected double length;
    protected double width;
    protected String type;

    public Rectangle() {};

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        type = "rectangle";
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "For your " + getType() + " with a length of: " + getLength() +
                "and a width of: " + getWidth() + ", the area is: " +
                getArea() + " and the perimeter is: " + getPerimeter();
    }
}
