package bookstore;

public class BookStore {
    static Customer[] customers = new Customer[8];

    static Author jKRowling = new Author("J K Rowling");
    static Author neilGaiman = new Author("Neil Gaiman");
    static Author dianaGabaldon = new Author("Diana Gabaldon");
    static Book hpOne = new Book("Harry Potter and the Philosopher's Stone", 20, jKRowling);
    static Book hpTwo = new Book("Harry Potter and the Chamber of Secrets", 20, jKRowling);
    static Book hpThree = new Book("Harry Potter and the Prisoner of Azkaban", 20, jKRowling);
    static Book hpFour = new Book("Harry Potter and the Goblet of Fire", 20, jKRowling);
    static Book hpFive = new Book("Harry Potter and the Order of the Phoenix", 20, jKRowling);
    static Book hpSix = new Book("Harry Potter and the Half Blood Prince", 20, jKRowling);
    static Book hpSeven = new Book("Harry Potter and the Deathly Hallows", 20, jKRowling);
    static Book amGods = new Book("American Gods", 15, neilGaiman);
    static Book sandman = new Book("Sandman", 30, neilGaiman);
    static Book outlander = new Book("Outlander", 22, dianaGabaldon);
    static Book dragonfly = new Book("Dragonfly in Amber", 23, dianaGabaldon);


    public static void main(String[] args) {

        System.out.println(jKRowling.getName() + " has written " + jKRowling.booksWritten + " books");
        System.out.println(neilGaiman.getName() + " has written " + neilGaiman.booksWritten + " books");
        System.out.println(dianaGabaldon.getName() + " has written " + dianaGabaldon.booksWritten + " books");

        customers[0] = new Customer("Emily", hpOne, hpTwo);
        customers[1] = new Customer("Alex", hpThree, hpFour);
        customers[2] = new Customer("Katie", hpFive, hpSix);
        customers[3] = new Customer("Tanner", hpSeven);
        customers[4] = new Customer("Lucy", outlander);
        customers[5] = new Customer("Jim", amGods);
        customers[6] = new Customer("Hannah", sandman);
        customers[7] = new Customer("Jessi", dragonfly);

        showCustomers(customers);

    }

    public static void showCustomers(Customer[] customers){
        for (Customer customer: customers){
            System.out.println("Customer: " + customer.getName() + " is buying: " + );
        }
    }
}
