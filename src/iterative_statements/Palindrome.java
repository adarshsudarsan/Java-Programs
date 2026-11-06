package iterative_statements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a =sc.nextInt();
		System.out.println("value of a "+a);
		int rev=0;
		int rem;
		int temp=a;
		
		while(a>0)
		{
		rem=a%10; //123%10 = 3		123%10 = 2
		rev = (rev * 10) + rem;		//0*10=3 = 3	3*10+2 = 32		32*10+1 = 321
		
		a=a/10; //123/10 = 12		12/10 = 1
		}
		System.out.println(rev);
		//System.out.println("The value of a = "+a);
		if(temp==rev)
		{
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}
	}
	
}
