package company;

public class Car extends Product{
    protected String make;
    protected String model;


    public Car(String name, double price, double cost, String make, String model) {
        super(name, price, cost);
        this.make = make;
        this.model = model;
    }
}
