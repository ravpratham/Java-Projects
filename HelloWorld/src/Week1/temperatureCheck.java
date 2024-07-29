package Week1;
import java.util.Scanner;

public class temperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in degrees Celsius: ");
        double temp = sc.nextDouble();

        if (temp >= 30.0){
            System.out.println("It's hot");
        }
        else if (temp >= 20.0 && temp < 30.0){
            System.out.println("It's warm");
        }
        else if (temp >= 10.0 && temp < 20.0){
            System.out.println("It's cool");
        }
        else{
            System.out.println("It's cold");
        }
    }
}
