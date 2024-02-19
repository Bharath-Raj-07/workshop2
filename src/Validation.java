import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validation {
    Scanner sc = new Scanner(System.in);
    public void firstname(Person p,BookService b){
        System.out.println("Enter your First Name :");
        boolean flagFirstName=false;
        while(!flagFirstName){
            String tempFirstName = sc.next();
            if(!check(b,tempFirstName)){
                System.out.println("Person Already Exists in Book !!!");
                System.out.println("Enter New First Name : ");
            }
            else {
                Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
                Matcher match = regex.matcher(tempFirstName);
                if (match.matches()) {
                    p.setFirstname(tempFirstName);
                    flagFirstName = true;
                } else {
                    System.out.println("Enter Valid First Name :");
                }
            }
        }
    }
    boolean check(BookService b, String name){
        return b.book.stream().noneMatch((s) -> s.getFirstname().equalsIgnoreCase(name));
    }
    public void lastname(Person p){
        System.out.println("Enter your Last Name :");
        boolean flagLastName=false;
        while(!flagLastName){
            String tempLastName = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(tempLastName);
            if (match.matches()) {
                p.setLastname(tempLastName);flagLastName = true;
            } else{
                System.out.println("Enter Valid Last Name :");
            }
        }
    }
    public void city(Person p){
        System.out.println("Enter the City Name :");
        boolean flagCity=false;
        while(!flagCity){
            String tempCity = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(tempCity);
            if (match.matches()) {
                p.setCity(tempCity);flagCity = true;
            } else{
                System.out.println("Enter Valid City Name :");
            }
        }
    }
    public void state(Person p){
        System.out.println("Enter the State Name :");
        boolean flagState=false;
        while(!flagState){
            String tempState = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(tempState);
            if (match.matches()) {
                p.setState(tempState);flagState = true;
            } else{
                System.out.println("Enter Valid State Name :");
            }
        }
    }
    public void zipcode(Person p){
        System.out.println("Enter ZipCode");
        boolean flagZipCode=false;
        while(!flagZipCode){
            String tempZipCode = sc.next();
            Pattern regex = Pattern.compile("^[0-9]{6}$");
            Matcher match = regex.matcher(tempZipCode);
            if (match.matches()) {
                p.setZipcode(tempZipCode);flagZipCode = true;
            } else{
                System.out.println("Enter Valid Zip Code : ");
            }
        }
    }
    public void email(Person p){
        System.out.println("Enter your Mail ID :");
        boolean flagEmail=false;
        while(!flagEmail) {
            String tempEmail = sc.next();
            Pattern regex = Pattern.compile("^[a-z]+[a-z0-9]+@[a-z]+(\\.[a-z]{2,})+$");
            Matcher match = regex.matcher(tempEmail);
            if (match.matches()) {
                p.setEmail(tempEmail);flagEmail = true;
            } else{
                System.out.println("Enter Valid Email ID : ");
            }
        }
    }
    public void phone(Person p){
        System.out.println("Enter your Phone Number : ");
        boolean flagNum=false;
        while(!flagNum){
            String tempNum = sc.next();
            Pattern regex = Pattern.compile("^[6-9]{1}[0-9]{9}+$");
            Matcher match = regex.matcher(tempNum);
            if (match.matches()) {
                p.setPhone(tempNum);flagNum = true;
            } else{
                System.out.println("Enter Valid Phone Number : ");
            }
        }
    }
}