package Week1;
import java.util.Scanner;

public class gradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        int marksCategory = marks / 10;
        if (marks <= 100) {
            switch (marksCategory) {
                case 10:
                    System.out.println("A-Excellent");
                    break;

                case 9:
                    System.out.println("A-Excellent");
                    break;

                case 8:
                    System.out.println("B-Very Good");
                    break;

                case 7:
                    System.out.println("C-Good");
                    break;

                case 6:
                    System.out.println("D-Satisfactory");
                    break;

                default:
                    if (marks >= 0 && marks < 60) {
                        System.out.println("F-Fail");
                    } else {
                        System.out.println("Invalid Marks");
                    }
                    break;
            }
        }

        else{
            System.out.println("Invalid Marks");
        }
        sc.close();
    }
}

