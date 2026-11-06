package scannerpackage;

import java.util.Scanner;

public class Reversepattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}