package javapackage;

public class operatorspgm {

	public static void main(String[] args) {
		//arithmetic operators
		System.out.println("Arithematic Operators");
		int a =5;
		int b =3;
		
		System.out.println("Addition = " +(a+b));
		System.out.println("Substraction = " +(a-b));
		System.out.println("Multiplication = " +(a*b));
		System.out.println("division = " +(a/b)); //quotient value
		System.out.println("modulus = " +(a%b)); //remainder value
		
		//Assignment Operators
		System.out.println("Assignment Operators");
		//a=b left, assigning the b value assign to a
		System.out.println(a+=b); //a= a+b 
		System.out.println(a-=b); //a= a-b
		
		//Relational Operators, the result will be boolean(true or false)
		System.out.println("Relational Operators");
		System.out.println("Value of a= " +a);
		System.out.println("Value of a= " +b);
		System.out.println(a==b); //false
		System.out.println(a>b); //true
		System.out.println(a>=b); //true
		System.out.println(a<b); //false
		System.out.println(a<=b); //false
		System.out.println(a!=b); //true
		
		
		//Logical Operator
		System.out.println("Logical Operator");
		String username= "abc";
		String password= "1234";
		
		System.out.println("AND");
		System.out.println(username =="abc" && password =="1234"); //will check both condition is true
		System.out.println("OR");
		System.out.println(password =="1234" || password =="123456"); //either one condition is true
		System.out.println("NOT");
		System.out.println(!(username =="abc")); //direct opposite
		
		System.out.println("Unary operators");
		int i=3;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		
		int j=10;
		System.out.println(j);
		System.out.println(++j);
		System.out.println(j);
		
		System.out.println("Ternary operators");
		
		int x=30, y=40;
		
		String s=x>y ? "x is greater" : "y is greater";
		System.out.println(s);
		
		boolean s1=x>y ? true: false;
		System.out.println(s1);
	}

}
