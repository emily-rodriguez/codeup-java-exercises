package company;

public class Subscription extends Product{
    public int numberOfMonths;

    public Subscription(String name, double price, double cost, int numberOfMonths) {
        super(name, price, cost);
        this.numberOfMonths = numberOfMonths;
        getRevenuePerPeriod();
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public double getRevenuePerPeriod() {
        return numberOfMonths * price;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "numberOfMonths=" + numberOfMonths +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
