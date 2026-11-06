package polymorphismpackage;

class Parent{
	public void qualification() {
		System.out.println("BCA");
	}
}

class Child extends Parent{

	//rightclick--source--overide or implement methods
	@Override 
	public void qualification() {
	System.out.println("BTech");	
		super.qualification();
	}
	
}

public class MthdOverriding {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.qualification();
		
		//Parent obj1=new Parent();
		//obj1.qualification();
	}

}
