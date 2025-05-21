import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner wordInput = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String wordString = wordInput.nextLine().toLowerCase();
        StringBuilder wordStringBuilder = new StringBuilder(wordString.toString());
        String wordStringRev = wordStringBuilder.reverse().toString();
        System.out.println(
            (wordString.equals(wordStringRev)
            ?"Palindrome":"Not Palindrone")
        );
        wordInput.close();
    }
}
