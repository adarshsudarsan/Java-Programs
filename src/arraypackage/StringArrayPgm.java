package arraypackage;

import java.util.Scanner;

public class StringArrayPgm {

	public static void main(String[] args) {
		String ar[] = new String[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println("The Array values are:");
		//for(int i=0;i<3;i++)
		//{
			//System.out.println(ar[i]+" ");
		//}
		for(String v:ar)
		{
			System.out.println(v+ " ");
		}
	}
}