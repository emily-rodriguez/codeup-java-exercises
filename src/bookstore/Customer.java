package bookstore;

public class Customer extends Person{
    double cartTotal;
    Product[] cart;


    public Customer(String name) {
        super(name);
    }

    public Customer(String name, Product book) {
        super(name);
        cart = new Product[1];
        cart[0] = book;
    }

    public Customer(String name, Product book, Product book2) {
        super(name);
        cart = new Product[2];
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
