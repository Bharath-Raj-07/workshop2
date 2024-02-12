import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Addressbookservice {
    Validation validate =new Validation();
    ArrayList<Person> book = new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void setvalue(Person p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        validate.firstname(p);
        System.out.println("Enter Last Name");
        validate.lastname(p);
        System.out.println("Enter City");
        validate.city(p);
        System.out.println("Enter State");
        validate.state(p);
        System.out.println("Enter Email");
        validate.email(p);
        System.out.println("Enter Phone Number");
        validate.phone(p);
    }
    public void addPerson()
    {
        Person p = new Person();
        setvalue(p);
        book.add(p);
        System.out.println(book);

    }
    public void editPerson(){
        System.out.println("Enter name to edit contact");
        String name=sc.next();
       for(int i=0;i<book.size();i++){ 
           if(Objects.equals(book.get(i).getFirstname(), name))
           {
               System.out.println("Current First Name = ["+book.get(i).getFirstname()+"] Enter New First Name");
               book.get(i).setFirstname(sc.next());
               System.out.println("Current Last Name = ["+book.get(i).getLastname()+"] Enter New Last Name");
               book.get(i).setLastname(sc.next());
               System.out.println("Current City = ["+book.get(i).getCity()+"] Enter New City");
               book.get(i).setCity(sc.next());
               System.out.println("Current State = ["+book.get(i).getState()+"] Enter New State");
               book.get(i).setState(sc.next());
               System.out.println("Current Email = ["+book.get(i).getEmail()+"] Enter New Email");
               book.get(i).setEmail(sc.next());
               System.out.println("Current Phone Number = ["+book.get(i).getPhone()+"] Enter New Phone Number");
               book.get(i).setPhone(sc.next());
               break;
           }
           else
               System.out.println("No such name found in Address Book");
       }
    }
    public void deletePerson(){
        System.out.println("Enter name to delete contact");
        String name=sc.next();
        for(int i=0;i<book.size();i++){
            if(Objects.equals(book.get(i).getFirstname(), name))
            {
                book.remove(i);
                break;
            }
            else
                System.out.println("No such name found in Address Book");
        }
    }
    @Override
    public String toString() {
        return "Addressbookservice{" +
                "book=" + book +
                '}';
    }
}
