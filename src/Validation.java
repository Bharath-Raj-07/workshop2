import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validation {
    Scanner sc = new Scanner(System.in);
    public void firstname(Person p){
        System.out.println("Enter your First Name :");
        for(;;){
            String temp = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(temp);
            if (match.matches()) {
                p.setFirstname(temp);
                System.out.println("First Name = "+p.getFirstname());break;
            } else{
                System.out.println("Enter Valid First Name :");
            }
        }
    }
    public void lastname(Person p){
        System.out.println("Enter your Last Name :");
        for(;;){
            String temp = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(temp);
            if (match.matches()) {
                p.setLastname(temp);
                System.out.println("Last Name = "+p.getLastname());break;
            } else{
                System.out.println("Enter Valid Last Name :");
            }
        }
    }
    public void city(Person p){
        System.out.println("Enter the City Name :");
        for(;;){
            String temp = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(temp);
            if (match.matches()) {
                p.setCity(temp);
                System.out.println("City = "+p.getCity());break;
            } else{
                System.out.println("Enter Valid City Name :");
            }
        }
    }
    public void state(Person p){
        System.out.println("Enter the State Name :");
        for(;;){
            String temp = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(temp);
            if (match.matches()) {
                p.setState(temp);
                System.out.println("State = "+p.getState());break;
            } else{
                System.out.println("Enter Valid State Name :");
            }
        }
    }
    public void email(Person p){
        System.out.println("Enter your Mail ID :");
        for(;;) {
            String temp = sc.next();
            Pattern regex = Pattern.compile("^[a-z]+@[a-z]+(\\.[a-z]{2,})+$");
            Matcher match = regex.matcher(temp);
            if (match.matches()) {
                p.setEmail(temp);
                System.out.println("Email ID = "+p.getEmail());break;
            } else{
                System.out.println("Enter Valid Email ID :");
            }
        }
    }
    public void phone(Person p){
        System.out.println("Enter your Phone Number : ");
        for(;;){
            String temp = sc.next();
            Pattern regex = Pattern.compile("^[+]{1}[0-9]{2} [6-9]{1}[0-9]{9}$");
            Matcher match = regex.matcher(temp);
            if (match.matches()) {
                p.setPhone(temp);
                System.out.println("Phone Number = "+p.getPhone());break;
            } else{
                System.out.println("Enter Valid Phone Number : ");
            }
        }
    }
}