package chapter2;
public class IfStatement {

    public static void main(String[] args) {
        int currentHour = 12;
        boolean compare = true;

        // If statement
        if (compare == true)
            System.out.println("Same!");

        //If Else Statement
        if (currentHour < 11) // NOTE: curly braces is optional for 2 or more statements
            System.out.println("Good Morning!");
        else if (currentHour == 12)
            System.out.println("Lunch Break!");
        else
            System.out.println("Good Afternoon!");

        // Switch Case
            int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }

        // Do-While statement
        byte a = 11;

        do
            System.out.println("do while: a = " + a--);
        while (a<0);
        System.out.println("end of program");

        // For statement
        for (byte f = 1; f <= 10;)
            System.out.println("for loop: " + f++);
        System.out.println("end of program");

        for (int x=1; x<10; x++){
            for (int y=1; y<=x; y++){
                System.out.print(y);
            }
            System.out.println();
        }
        
        // For Each statement
        int colorCount = 0;
        String colorSearch = "black";
        String[] colors = {"black", "red", "orange", "yellow", "green", "black"};
        for (String color : colors) {
            if (color.equals(colorSearch))
            colorCount++;
        System.out.println("color: " + color);
        }
        System.out.println("Color Found: " + colorCount + " " + colorSearch);
        System.out.println("end of program");

        // Nested For
ROW_TABLE:  for (int c = 1; c <= 10; c++) {
COL_TABLE:      for (int d = 1; d <=10; d++) {
                    if (c==7) {
                        break ROW_TABLE;
                    }
                    System.out.print(c*d + "\t");
                }
            System.out.println();
        }
        System.out.println("end of program");
    }
}