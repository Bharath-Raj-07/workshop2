import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BookManager {
    HashMap<String, BookService> addressBook = new HashMap<String, BookService>();
    void addBook(String bookName){
        if(!addressBook.containsKey(bookName)){
            BookService book =new BookService();
            addressBook.put(bookName, book);
        }
        else
            throw new RuntimeException("Book Already Exists !!");
    }
    void deleteBook(String bookName){
        if(addressBook.get(bookName) != null)
        {
            addressBook.remove(bookName);
            System.out.println("Removed Book Successfully");
        }
        else{
            System.out.println("No such name found in Address Book");
        }
    }
    void display(){
        System.out.println(addressBook.keySet());
    }

    public BookService openBook(String bookName) {
        BookService book = addressBook.get(bookName);
        if(book!=null){
            return book;
        }
        else {
            throw new RuntimeException("Book doesn't exist");
        }
    }
    void searchCity(String searchCity){
        for(BookService value : addressBook.values()){
            value.searchCity(searchCity);
        }
    }
    void searchState(String searchState){
        for(BookService value : addressBook.values()){
            value.searchState(searchState);
        }
    }
    @Override
    public String toString() {
        return "AddressBook=" + addressBook +
                '}';
    }
}