package bookstore;

public class Book extends Product{
    public Author author;

    public Book(String title, double price, Author author) {
        super(title, price);
        this.author = author;
        author.booksWritten += 1;
    }

    public Author getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
