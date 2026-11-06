package arraypackage;

import java.util.Scanner;

public class LargestnoArray {

    public static void main(String[] args) {

        int[] a2 = new int[3];

        System.out.println("Enter the numbers");

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            a2[i] = sc.nextInt();
        }

        int largest = a2[0];

        for(int i = 0; i < 3; i++)
        {
            if(a2[i] > largest)
            {
                largest = a2[i];
            }
        }

        System.out.println("Largest number: " + largest);
    }
}