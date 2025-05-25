import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner uScanner = new Scanner(System.in);
        ArrayList<Integer> numArrayList = new ArrayList<>();

        System.out.println("Enter three numbers: ");
        numArrayList.add(uScanner.nextInt());
        numArrayList.add(uScanner.nextInt());
        numArrayList.add(uScanner.nextInt());
        uScanner.close();
        Collections.sort(numArrayList);
        System.out.println("Highest number on the list input is: " + numArrayList.get(2));
        System.out.print(numArrayList.stream().allMatch(s -> s.equals(numArrayList.get(0))) 
                            ? "All input list numbers are equals" : "");
    }
}
