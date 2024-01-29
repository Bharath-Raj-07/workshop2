import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Addressbookservice {
    ArrayList<Person> book = new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void addPerson(Person p1){
        book.add(p1);
    }
    public void editPerson(){
        System.out.println("Enter name to edit contact");
        String name=sc.next();
       for(int i=0;i<book.size();i++){
           if(Objects.equals(book.get(i).firstname, name))
           {
               System.out.println("Current First Name = ["+book.get(i).firstname+"] Enter New First Name");
               book.get(i).firstname=sc.next();
               System.out.println("Current Last Name = ["+book.get(i).lastname+"] Enter New Last Name");
               book.get(i).lastname=sc.next();
               System.out.println("Current City = ["+book.get(i).city+"] Enter New City");
               book.get(i).city=sc.next();
               System.out.println("Current State = ["+book.get(i).state+"] Enter New State");
               book.get(i).state=sc.next();
               System.out.println("Current Email = ["+book.get(i).email+"] Enter New Email");
               book.get(i).email=sc.next();
               System.out.println("Current Phone Number = ["+book.get(i).phone+"] Enter New Phone Number");
               book.get(i).phone=sc.next();
               break;
           }
       }
    }
    public void deletePerson(){
        System.out.println("Enter name to delete contact");
        String name=sc.next();
        for(int i=0;i<book.size();i++){
            if(Objects.equals(book.get(i).firstname, name))
            {
                book.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Addressbookservice{" +
                "book=" + book +
                '}';
    }
}
