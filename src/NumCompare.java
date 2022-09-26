import java.util.InputMismatchException;
import java.util.Scanner;


public class NumCompare {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int userInputOne, userInputTwo;


        try {
            System.out.println("Please enter first Integer Number to be compared:");
            userInputOne = sc.nextInt();
            System.out.println("Please enter second Integer Number to be compered:");
            userInputTwo = sc.nextInt();
            if (userInputOne < userInputTwo) {


                System.out.println("Input two greater than input one.");


            } else if (userInputOne > userInputTwo) {


                System.out.println("Input one greater than input two.");


            } else {


                System.out.println("Both the integer numbers are the same.");


            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Please try again.");
            //flag = false;
        }


    }


}