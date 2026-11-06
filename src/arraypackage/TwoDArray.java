package arraypackage;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		//2x3 metrics
		//2 rows
		//3 columns
		
		int[][] a2 = new int[2][3];
//		a2[0][0]= 5; //0th row 0th column
//		a2[0][1]= 2; //0th row 1st column
//		a2[0][2]= 4; //0th row 2nd column
//		a2[1][0]= 3; //1st row 0th column
		System.out.println("enter the values= ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				a2[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("The values are =");
		{
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a2[i][j] + " ");
				}
				System.out.println();
		}
	}
	}
}
