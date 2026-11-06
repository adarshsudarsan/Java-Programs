package inheritancepackage;

class Parent{ //parent class
	int a=5;
	public void parentmenthod() {
		System.out.println("parentmethod");
	}
}

class Child extends Parent{ //child class which inherits the properties of class parent
	public void childmethod() {
		System.out.println("childmethod");
	}
}


public class SingleLevel {

	public static void main(String[] args) {
	Child obj=new Child();
	System.out.println("value of a :"+obj.a);//calling parent class variable using child class
	obj.parentmenthod();//calling parent class method using child class
	obj.childmethod();

	}

}
