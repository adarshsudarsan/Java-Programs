package stringpackage;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while(num > 0)
        {
            int di = num % 10;
            sum = sum + (di * di * di);
            num = num / 10;
        }

        if(sum == original)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}	