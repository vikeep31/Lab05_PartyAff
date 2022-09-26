import java.util.InputMismatchException;
import java.util.Scanner;
public class TheaterKiosk {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int userAge;
        try {
            System.out.println("Please enter your age:");
            userAge = sc.nextInt();
            if (userAge > 21) {


                System.out.println("You get a wristbrand!");


            }   else


                System.out.println("You are not over 21, you do not get a wristbrand!");
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Please try again.");
            //flag = false;
        }
    }
}