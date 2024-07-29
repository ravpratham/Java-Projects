package Week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("enter 1 for addition or enter 2 for subtraction: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println(a + b);
        }
        else if (choice == 2) {
            if (a > b) {
                System.out.println(a - b);
            }
            else{
                System.out.println(b - a);
            }
        }
        sc.close();
    }
}