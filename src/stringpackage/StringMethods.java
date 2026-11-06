package stringpackage;

public class StringMethods {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
//		if(s2==s3)	//result will be false because '==' comparing the reference numbers not the values
//		{
//			System.out.println("values are equal");
//		}
//		else {
//			System.out.println("values are not equal");
//		}
		//equal()
		if(s2.equals(s3))
		{
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal");
		}
		
		//equalsIgnoreCase()
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal");
		}

		//concat()
		String s4="World";
		System.out.println(s1.concat(s4)); //helloworld
		
		//contains()
		System.out.println(s4.contains("Wo")); //true
		
		//toUppercase()
		System.out.println(s1.toUpperCase()); //HELLOWORLD
		
		//toLowercase()
		System.out.println(s1.toLowerCase()); //HELLOWORLD
		
		//length()
		System.out.println(s1.length()); //5
		
	}

}

