import java.util.ArrayList;
public class Library {
    
    //Composition
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(String ISBN) {
        for (Book b : books) {
            if (b.getISBN().equals(ISBN)) {
                books.remove(b);
                return true;
            }
        }
        return false;
    }

    public Book[] searchBook(String title) {
        ArrayList<Book> matches = new ArrayList<>();
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                matches.add(b);
            }
        }
        return matches.toArray(new Book[0]);
    }

    public Book[] displayBooks() {
        return books.toArray(new Book[0]);
    }

}
