// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BookstoreApplication{
    public static void main(String[] args) throws BookNotFoundException {

        Bookstore bookstore = new Bookstore();
        Book book = new Book("Ufo", "Salvatore",10.0);
        Book book1 = new Book("Hehe","Fulop",20.0);
        Book book2 = new Book ("Uff","Ugralo Kecske",30.0);
        bookstore.addBooks(book);
        bookstore.addBooks(book1);
        bookstore.addBooks(book2);

        bookstore.findBook();




    }
}