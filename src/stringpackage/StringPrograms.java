package stringpackage;

import java.util.Scanner;

public class StringPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String s1 = sc.nextLine();

        System.out.println(s1.contains("Morning"));

        String s2 = "Java is simple and easy to learn";
        String[] ar = s2.split(" ");

        for(String v : ar)
        {
            System.out.println(v);
        }

        System.out.println("The number of words: " + ar.length);

        String s3 = "Hello all";
        System.out.println(s3.replace("all", "Everyone"));
    }
}