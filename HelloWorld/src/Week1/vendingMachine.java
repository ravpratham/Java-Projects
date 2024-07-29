package Week1;
import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for juice or 2 for soda: ");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println("Dispensing Juice");
        }
        else if (choice == 2){
            System.out.println("Dispensing Soda");
        }
        else{
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
