package bookstore;

public class Customer extends Person{
    Product[] cart = new Product[2];

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

    public static String showProductsinCart(Product[] cart){
        for (Product item : cart){
           String itemInCart = "Items in cart: " + item.getTitle() + ", $" + item.getPrice();
        }
    }

//    public static void showCart(Customer customer){
//    }


}
