import java.util.ArrayList;
import java.util.List;

public class Bookstore  {

    private List<Book> books = new ArrayList<>();

    public void addBooks(Book book){
    books.add(book);

    }
    Book findBook() throws BookNotFoundException {
        throw new BookNotFoundException();
    }
    public void displayBooks(){

    }


}
