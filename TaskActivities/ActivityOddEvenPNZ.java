import java.util.Scanner;

public class ActivityOddEvenPNZ {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput%2==0)
            System.out.println(userInput + " is an Even number");
        else
            System.out.println(userInput + " is an Odd number");

        if (userInput<0) 
            System.out.println(userInput + " is Negative number");
        else if (userInput==0)
            System.out.println(userInput + " is Zero number");
        else
            System.out.println(userInput + " is Positive number");
    }
}
