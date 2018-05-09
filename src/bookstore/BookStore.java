package bookstore;

import java.text.DecimalFormat;

public class BookStore {
    static Customer[] customers = new Customer[8];

    static Author jKRowling = new Author("J K Rowling");
    static Author neilGaiman = new Author("Neil Gaiman");
    static Author dianaGabaldon = new Author("Diana Gabaldon");
    static Book hpOne = new Book("Harry Potter and the Philosopher's Stone", 22, jKRowling);
    static Book hpTwo = new Book("Harry Potter and the Chamber of Secrets", 25, jKRowling);
    static Book hpThree = new Book("Harry Potter and the Prisoner of Azkaban", 25, jKRowling);
    static Book hpFour = new Book("Harry Potter and the Goblet of Fire", 18, jKRowling);
    static Book hpFive = new Book("Harry Potter and the Order of the Phoenix", 20, jKRowling);
    static Book hpSix = new Book("Harry Potter and the Half Blood Prince", 24, jKRowling);
    static Book hpSeven = new Book("Harry Potter and the Deathly Hallows", 26, jKRowling);
    static Book amGods = new Book("American Gods", 15, neilGaiman);
    static Book sandman = new Book("Sandman", 30, neilGaiman);
    static Book outlander = new Book("Outlander", 22, dianaGabaldon);
    static Book dragonfly = new Book("Dragonfly in Amber", 23, dianaGabaldon);

    private static DecimalFormat df2 = new DecimalFormat(".00");

    public static void main(String[] args) {

        System.out.println("Welcome to the \"limit two books per person\" bookstore");
        System.out.println();
//        System.out.println(jKRowling.getName() + " has written " + jKRowling.booksWritten + " books");
//        System.out.println(neilGaiman.getName() + " has written " + neilGaiman.booksWritten + " books");
//        System.out.println(dianaGabaldon.getName() + " has written " + dianaGabaldon.booksWritten + " books");

        customers[0] = new Customer("Emily", hpOne, hpTwo);
        customers[1] = new Customer("Alex", hpThree, hpFour);
        customers[2] = new Customer("Katie", hpFive, hpSix);
        customers[3] = new Customer("Tanner", hpSeven, hpTwo);
        customers[4] = new Customer("Lucy", outlander);
        customers[5] = new Customer("Jim", amGods, sandman);
        customers[6] = new Customer("Hannah", sandman, hpFive);
        customers[7] = new Customer("Jessi", dragonfly, hpFour);

        showCustomerCarts(customers);
    }

    public static void showCustomerCarts(Customer[] customers){
        for (Customer customer: customers){
            System.out.println("Customer " + customer.name + " is buying: ");
            if (customer.cart.length > 1) {
                for (int i = 0; i < customer.cart.length; i++) {
                    System.out.println(customer.cart[i].title + " for $" + df2.format(customer.cart[i].price));
                }
            } else {
                System.out.println(customer.cart[0].title + " for $" + df2.format(customer.cart[0].price));
            }
            System.out.println("The cart total is: $" + df2.format(customer.getTotal(customer.cart)));
        }
    }
}
