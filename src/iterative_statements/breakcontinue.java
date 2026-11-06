package iterative_statements;

public class breakcontinue {

	public static void main(String[] args) {
		int i=0;
		for(i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break; //to terminate the execution
				continue; //to continue further execution
			}
			System.out.println(i);
		}

	}

}
