import static java.lang.Math.*;

public class Task9{

    public static int add(int a, int b) { // Your code here
        System.out.print("Add: ");
        return Math.addExact(a, b);
    }
    public static int subtract (int a, int b) { // Your code here
        System.out.print("Subtract: ");
        return Math.subtractExact(a, b);
    }
    public static int multiply (int a, int b) { // Your code here
        System.out.print("Multiply: ");
        return Math.multiplyExact(a, b);
    }
    public static float divide (int a, int b) { // Your code here
        System.out.print("Divide: ");
        return Math.floorDiv(a, b);
    }
    public static void main(String[] args) { // Demonstrate the math operations here
        System.out.println(add(6, 9));
        System.out.println(subtract(4, 20));
        System.out.println(multiply(9, 11));
        System.out.println(Math.round(divide(14, 3)));
    }
}
