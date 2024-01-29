import java.util.Scanner;

public class Person {
    String firstname;
    String lastname;
    String city;
    String state;
    String email;
    String phone;
    Person(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        this.firstname=sc.next();
        System.out.println("Enter Last Name");
        this.lastname=sc.next();
        System.out.println("Enter City");
        this.city=sc.next();
        System.out.println("Enter State");
        this.state=sc.next();
        System.out.println("Enter Email");
        this.email=sc.next();
        System.out.println("Enter Phone Number");
        this.phone=sc.next();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastnamne='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}