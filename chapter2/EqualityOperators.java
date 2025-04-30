package chapter2;

import java.io.File;

public class EqualityOperators {

    public static void main(String[] args) {
        File x = new File("newFile.txt");
        File y = new File("newFile.txt");
        File z = x;

        System.out.println(x == y);
        System.out.println(x == z);

    }
}