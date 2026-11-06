package accessmodifierpkg;

public class AccessModifierpgm {
	private int a = 10;// private variable
	int b = 15; //default variable
	protected int c = 20; //protected variable
	public int d = 25; //public variable
	
	
	public static void main(String[] args) {
		AccessModifierpgm obj = new AccessModifierpgm();
		System.out.println("Private variable : " + obj.a);
		System.out.println("default variable : " + obj.b);
		System.out.println("protected variable : " + obj.c);
		System.out.println("Public variable : " + obj.d);
	}

}
