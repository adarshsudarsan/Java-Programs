package accessmodifierpkg;

public class Sample {

	public static void main(String[] args) {
		AccessModifierpgm obj = new AccessModifierpgm();
		//System.out.println("Private variable : " + obj.a); // because it is private variable
		System.out.println("default variable : " + obj.b);
		System.out.println("protected variable : " + obj.c);
		System.out.println("Public variable : " + obj.d);

	}

}
