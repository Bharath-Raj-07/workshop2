import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Person p1 = new Person();
        System.out.println(p1);
        Addressbookservice a1=new Addressbookservice();
        a1.addPerson(p1);
        System.out.println(a1);
        a1.editPerson();
        System.out.println(a1);
        a1.deletePerson();
        System.out.println(a1);
    }
}