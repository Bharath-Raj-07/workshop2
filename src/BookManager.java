import java.util.HashMap;
public class BookManager {
    HashMap<String, BookService> addressbook = new HashMap<String, BookService>();
    BookService addBook(String bookname){
        if(!addressbook.containsKey(bookname)){
            BookService book =new BookService();
            addressbook.put(bookname, book);
            return book;
        }
        else
            throw new RuntimeException("Book Already Exists !!");
    }
    void deleteBook(String bookName){
        if(addressbook.get(bookName) != null)
        {
            addressbook.remove(bookName);
            System.out.println("Removed Book Successfully");
        }
        else{
            System.out.println("No such name found in Address Book");
        }
    }
    void display(){
        System.out.println(addressbook.keySet());
    }

    public BookService openBook(String bookName) {
        // Search bookName in Hashmap
        //Return the book
        BookService book = addressbook.get(bookName);
        if(book!=null){
            return book;
        }
        else {
            throw new RuntimeException("Book doesn't exist");
        }
    }
    @Override
    public String toString() {
        return "AddressBook=" + addressbook +
                '}';
    }
}
