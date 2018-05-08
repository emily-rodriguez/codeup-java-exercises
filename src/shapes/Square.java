package shapes;

public class Square extends Rectangle{
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
        type = "square";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
