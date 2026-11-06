package accessmodifier2;

import accessmodifierpkg.AccessModifierpgm;

public class Access2 extends AccessModifierpgm { //Access2 is the child class of AccessModifierpgm


	public static void main(String[] args) {
		Access2 obj = new  Access2();
		//System.out.println("Private variable : " + obj.a); //it is private variable
		//System.out.println("default variable : " + obj.b); //it is default variable
		System.out.println("protected variable : " + obj.c);
		System.out.println("Public variable : " + obj.d);
		
			}

}
