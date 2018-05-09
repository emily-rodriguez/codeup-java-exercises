package bookstore;

public class Product {
    protected String title;
    protected double price;

    public Product() {};

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }



    public double getTotal(double price, double price2, double price3) {
        return price + price2 + price3;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
