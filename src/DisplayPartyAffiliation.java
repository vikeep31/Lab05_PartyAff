import java.util.Scanner;

public class DisplayPartyAffiliation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        System.out.print("Enter your party affiliation: ");
        input = scanner.next().charAt(0);

        switch (input) {
            case 'd':
            case 'D':
                System.out.println("You get a Democratic Donkey.");
                break;
            case 'r':
            case 'R':
                System.out.println("You get a Republican Elephant.");
                break;
            case 'i':
            case 'I':
                System.out.println("You get an Independent Person.");
                break;
            default:
                System.out.println("You get Other.");
        }
    }
}