import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        //Person p1 = new Person();
        //System.out.println(p1);
        Addressbookservice a1 = new Addressbookservice();
        a1.addPerson(a1);
        boolean flag=false;
        for(int i=0;;i++)
        {

            System.out.println("Enter 1)Add 2)Edit 3)Delete 9)Exit in the Address Book");int entry=sc.nextInt();
            switch(entry){
                case 1 : a1.addPerson(a1);break;
                case 2 : a1.editPerson();System.out.println(a1);break;
                case 3 : a1.deletePerson();System.out.println(a1);break;
                case 9 : flag=true;break;
                default: System.out.println("Invalid Input");break;
            }
            if(flag==true)
                break;
        }
    }
}