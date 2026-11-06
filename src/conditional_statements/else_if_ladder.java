package conditional_statements;

public class else_if_ladder {

	public static void main(String[] args) 
	{
		int a=5,b=2,c=3;
		if(a>b && a>c) 
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c){
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}

}
