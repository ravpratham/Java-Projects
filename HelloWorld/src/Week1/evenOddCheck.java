package Week1;
import java.util.Scanner;

public class evenOddCheck {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();

        if (number%2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        scan.close();
    }
}
