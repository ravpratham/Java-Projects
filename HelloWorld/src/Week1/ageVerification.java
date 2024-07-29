package Week1;
import java.util.Scanner;

public class ageVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("You are eligible to vote!");
        }

        else if (age < 18){
            System.out.println("You are not eligible to vote!");
        }
        sc.close();
    }
}
