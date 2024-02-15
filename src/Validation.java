import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validation {
    Scanner sc = new Scanner(System.in);
    public void firstname(Person p){
        System.out.println("Enter your First Name :");
        boolean flagFname=false;
        while(flagFname == false){
            String tempFname = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(tempFname);
            if (match.matches()) {
                p.setFirstname(tempFname);flagFname = true;
            } else{
                System.out.println("Enter Valid First Name :");
            }
        }
    }
    public void lastname(Person p){
        System.out.println("Enter your Last Name :");
        boolean flagLname=false;
        while(flagLname == false){
            String tempLane = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(tempLane);
            if (match.matches()) {
                p.setLastname(tempLane);flagLname = true;
            } else{
                System.out.println("Enter Valid Last Name :");
            }
        }
    }
    public void city(Person p){
        System.out.println("Enter the City Name :");
        boolean flagcity=false;
        while(flagcity == false){
            String tempcity = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(tempcity);
            if (match.matches()) {
                p.setCity(tempcity);flagcity = true;
            } else{
                System.out.println("Enter Valid City Name :");
            }
        }
    }
    public void state(Person p){
        System.out.println("Enter the State Name :");
        boolean flagState=false;
        while(flagState == false){
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
        while(flagZipCode==false){
            String tempzipcode = sc.next();
            Pattern regex = Pattern.compile("^[0-9]{6}$");
            Matcher match = regex.matcher(tempzipcode);
            if (match.matches()) {
                p.setEmail(tempzipcode);flagZipCode = true;
            } else{
                System.out.println("Enter Valid Zip Code : ");
            }

        }
    }
    public void email(Person p){
        System.out.println("Enter your Mail ID :");
        boolean flagEmail=false;
        while(flagEmail == false) {
            String tempEmail = sc.next();
            Pattern regex = Pattern.compile("^[a-z]+@[a-z]+(\\.[a-z]{2,})+$");
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
        while(flagNum == false){
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