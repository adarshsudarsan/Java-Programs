package arraypackage;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int a1[] = new int[3];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i=0;i<3;i++)
		{
			a1[i]=sc.nextInt();
		}
		//System.out.println("The Array values are:");
		for(int v:a1)
			sum=sum+v;
		{
			//System.out.println(v+" ");
			System.out.println("sum = "+sum);
		}
	}

}
