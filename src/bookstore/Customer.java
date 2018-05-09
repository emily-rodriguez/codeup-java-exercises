package bookstore;

public class Customer extends Person{
    Product[] cart = new Product[2];
    double cartTotal;


    public Customer(String name) {
        super(name);
    }

    public Customer(String name, Product book) {
        super(name);
        cart[0] = book;
    }

    public Customer(String name, Product book, Product book2) {
        super(name);
        cart[0] = book;
        cart[1] = book2;
    }

    public double getTotal(Product[] cart) {
        for (Product item: cart) {
            cartTotal += (int) item.price;
        }
        return cartTotal;
    }

}
