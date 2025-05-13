import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = input.nextInt();
        System.out.println("\n1 - Addition (+)");
        System.out.println("2 - Subtraction (-)");
        System.out.println("3 - Multiplication (*)");
        System.out.println("4 - Division (/)");
        System.out.println("Enter the operator type (rangely 1-4)");
        System.out.print("based on the options above: ");
        byte operator = input.nextByte();
        switch (operator) {
            case 1:
                System.out.print("\nEnter the second number: ");
                y = input.nextInt();

                z = x + y;
                System.out.println("\n" + x + "+" + y + " = " + z);
                break;
            case 2:
                System.out.print("\nEnter the second number: ");
                y = input.nextInt();
                z = x - y;
                System.out.println("\n" + x + "-" + y + " = " + z);
                break;
            case 3:
                System.out.print("\nEnter the second number: ");
                y = input.nextInt();
                z = x * y;
                System.out.println("\n" + x + "*" + y + " = " + z);
                break;
            case 4:
                System.out.print("\nEnter the second number: ");
                y = input.nextInt();
                z = x / y;
                System.out.println("\n" + x + "/" + y + " = " + z);
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }
        input.close();
    }
}
