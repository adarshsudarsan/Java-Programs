package scannerpackage;

import java.util.Scanner;

public class Scanner_pgm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name =sc.next();
		
		System.out.println("Enter the roll number");
		int roll= sc.nextInt();
		
		sc.nextLine();

		
		System.out.println("Enter the address");
		String address = sc.nextLine();
		
				
		System.out.println("Grade");
		char grade = sc.next().charAt(0);
		
		System.out.println("Height");
		double height = sc.nextDouble();
		
		System.out.println("name: "+name);
		System.out.println("roll number: "+roll);
		System.out.println("address: "+address);
		System.out.println("grade: "+grade);
		System.out.println("height: "+height);

	}

}
