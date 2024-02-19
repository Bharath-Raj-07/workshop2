import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookService{
    ArrayList<Person> State = new ArrayList<>();
    Validation validate =new Validation();
    ArrayList<Person> book = new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void addPerson()
    {
        Person p = new Person();
        validate.firstname(p, this);
        validate.lastname(p);
        validate.city(p);
        validate.state(p);
        validate.zipcode(p);
        validate.email(p);
        validate.phone(p);
        book.add(p);
        System.out.println("Contact added Successfully !!! ");
    }
    public void editPerson(){
        System.out.println("Enter name to edit contact");
        String name=sc.next();
        for (Person person : book) {
            if (Objects.equals(person.getFirstname(), name)) {
                int entry;
                do {
                    System.out.println("""
                            Entered Edit Mode !!!\s
                            1)Edit Firstname\s
                            2)Edit Lastname\s
                            3)Edit City\s
                            4)Edit State\s
                            5)Edit Zip Code\s
                            6)Edit Email\s
                            7)Edit Phone Number\s
                            0)Exit Edit Mode\s
                            """);
                    entry = sc.nextInt();
                    switch (entry) {
                        case 1:
                            System.out.println("Current First Name = [" + person.getFirstname() + "] Enter New First Name");
                            validate.firstname(person,this);break;
                        case 2:
                            System.out.println("Current Last Name = [" + person.getLastname() + "] Enter New Last Name");
                            validate.lastname(person);break;
                        case 3:
                            System.out.println("Current City = [" + person.getCity() + "] Enter New City");
                            validate.city(person);break;
                        case 4:
                            System.out.println("Current State = [" + person.getState() + "] Enter New State");
                            validate.state(person);break;
                        case 5:
                            System.out.println("Current ZipCode = [" +person.getZipcode() + "] Enter New Zipcode");
                            validate.zipcode(person);break;
                        case 6:
                            System.out.println("Current Email = [" + person.getEmail() + "] Enter New Email");
                            validate.email(person);break;
                        case 7:
                            System.out.println("Current Phone Number = [" + person.getPhone() + "] Enter New Phone Number");
                            validate.phone(person);break;
                        case 0:break;
                        default:System.out.println("Invalid Input"); break;
                    }
                } while (entry!=0);
            } else
                System.out.println("No such name found in Address Book");
        }
    }
    public void deletePerson(){
        System.out.println("Enter name to delete contact");
        String name=sc.next();
        for(int i = 0; i< book.size(); i++){
            if(Objects.equals(book.get(i).getFirstname(), name))
            {
                book.remove(i);
                System.out.println("Removed Contact Successfully");
                break;
            }
            else
                System.out.println("No such name found in Address Book");
        }
    }
    public void display(){
        System.out.println(book);
    }
    void searchCity(String city){
        book.stream()
                .filter(c-> c.getCity().equalsIgnoreCase(city))
                .forEach(System.out::println);
    }
    void searchState(String state){
        book.stream()
                .filter(s -> s.getState().equalsIgnoreCase(state))
                .forEach(System.out::println);
    }
    @Override
    public String toString() {
        return "Book=" + book +
                "\n";
    }
}