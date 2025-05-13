package prog_challenge;
import java.util.Scanner;

public class score_to_grade_f_to_a {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.print("Enter a grade (Ranges from 0-100): ");
        int userInput = userScanner.nextInt();
        userScanner.close();
        if (userInput >= 101) {
            System.out.println("Above 100! You must input from range 0-100.");
        } else if (userInput >= 90) {
            System.out.println("A");
        } else if (userInput >= 80) {
            System.out.println("B");
        } else if (userInput >= 70) {
            System.out.println("C");
        } else if (userInput >= 60) {
            System.out.println("D");
        } else if (userInput >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Below 0! You must input from range 0-100.");
        }
    }
}
