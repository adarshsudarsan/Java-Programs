package scannerpackage;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		//int a=0;
		//int b=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a =sc.nextInt();
		System.out.println("Enter the second number");
		int b =sc.nextInt();
		
		int c = a+b;
		
		System.out.println("Addition =" +c);

	}

}
