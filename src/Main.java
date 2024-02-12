import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        Addressbookservice a1 = new Addressbookservice();
        a1.addPerson();
        boolean flag=false;
        for(;;)
        {

            System.out.println("Enter 1)Add 2)Edit 3)Delete 0)Exit in the Address Book");int entry=sc.nextInt();
            switch(entry){
                case 1 : a1.addPerson();System.out.println(a1);break;
                case 2 : a1.editPerson();System.out.println(a1);break;
                case 3 : a1.deletePerson();System.out.println(a1);break;
                case 0 : flag=true;break;
                default: System.out.println("Invalid Input");break;
            }
            if(flag==true)
                break;
        }
        System.out.println(a1);
    }
}