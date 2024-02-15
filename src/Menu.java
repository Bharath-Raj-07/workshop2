import java.util.Objects;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookManager books = new BookManager();
        System.out.println("Welcome to Address Book !! ");
        BookService currentBook;
        int entry = -1;
        while(entry!=0) {
            System.out.println("""
                    1)Create a New Book\s
                    2)Open Existing Book\s
                    3)Delete a Book\s
                    0)Exit Book\s
                    """);
            entry = sc.nextInt();
            String bookName = "";
            switch (entry) {
                case 1:
                    System.out.println("Enter Book name : ");
                    bookName = sc.next();
                    try{
                        books.addBook(bookName);
                        currentBook = books.openBook(bookName);
                        bookMenu(bookName, currentBook);
                    }catch (RuntimeException e){
                        System.out.println("The Book Already Exists !!! \n");
                    }break;
                case 2:
                    if (Objects.equals(bookName, "")){
                        System.out.println("Current books in the AddressBook : \n");
                        books.display();
                        System.out.println("Enter Book name : ");
                        bookName = sc.next();
                    }
                    try {
                        currentBook = books.openBook(bookName);
                        bookMenu(bookName, currentBook);
                    } catch (RuntimeException e){
                        System.out.println("The Book doesn't Exist");
                    }
                    break;
                case 3:
                    System.out.println("Enter the Name of Book to be deleted ");
                    books.deleteBook(sc.next());
                    break;
                case 0:break;
                default:
                    System.out.println("Invalid Input");break;
            }
        }

    }
    public static void bookMenu(String bookName, BookService book){
        Scanner sc=new Scanner(System.in);
        System.out.println("Book Currently opened " + bookName);
        int entry;
        do {
            System.out.println("Enter command \n" +
                    "1)List all Contacts \n" +
                    "2)Add Contact of a Person \n" +
                    "3)Edit Contact of a Person  \n" +
                    "4)Delete Contact of a Person \n" +
                    "0)Exit " + bookName + " Book \n" );
            entry = sc.nextInt();
            switch (entry) {
                case 1:
                    book.display();break;
                case 2:
                    book.addPerson(); System.out.println(book); break;
                case 3:
                    book.editPerson(); System.out.println(book); break;
                case 4:
                    book.deletePerson(); System.out.println(book); break;
                case 0:break;
                default:
                    System.out.println("Invalid Input"); break;
            }
        } while (entry!=0);
        System.out.println(book);
    }
}