package bookstore;

public class Author extends Person{
    public int booksWritten = 0;

    public Author() {};

    public Author(String name) {
        super(name);
    }
}
