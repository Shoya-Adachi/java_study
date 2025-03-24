import java.util.Iterator;

public class Main {
    public static void main(String[] arags) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("ハリーポッター"));
        bookShelf.appendBook(new Book("コナン"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("test"));
        bookShelf.appendBook(new Book("test2"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }   
}
