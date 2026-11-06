package polymorphismpackage;

public class MthdOverloading {

	public void add(int a,int b) {
		System.out.println("method 1: " +(a+b));
	}
	public void add(int a,int b, int c) {
		System.out.println("method 2: " +(a+b+c));
	}
	public void add(int a,double b) {
		System.out.println("method 3: " +(a+b));
	}
	public void add(double a,int b) {
		System.out.println("method 4: " +(a+b));
	}
	
	
	public static void main(String[] args) {
		MthdOverloading obj=new	MthdOverloading();
		obj.add(1, 2, 3);
		obj.add(5.0, 7);
		obj.add(5, 7);
		obj.add(1, 2.5);
	}

}
