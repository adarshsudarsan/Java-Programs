package polymorphismpackage;

public class StaticFinal {
	int a=5;
	static String Company="lumninar";
	final double pi=3.14; //final store constant value
	static final double piValue=3.14;
	

	public static void main(String[] args) {
		StaticFinal obj=new StaticFinal();
		System.out.println("value of a: "+obj.a);
		
		System.out.println("Value of company : "+Company);//company is a static variable, we can use it without creating the object
		Company = "luminar technolab";
		System.out.println("Update value : "+Company);
		
		System.out.println("Value of pi : "+obj.pi);
		//obj.pi=4.14; //the value of final variable cannot be modified
		System.out.println("Value of piValue : "+piValue); //variable declared using static final keyword
	}

}
