package AbstractionPkg;
abstract class Parent //abstract class
{
	abstract public void display(); //abstract method-method without implementation
	public void normalmthd() //its a normal method without implementation
	{
		System.out.println("Normal method");
	}
}


	
	
	
	class Child extends Parent{

		@Override
		public void display() {
			System.out.println("Abstract method");
			
		}
		
	}
	
	public class AbstractionPgm {	
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.normalmthd();
		

	}

}
