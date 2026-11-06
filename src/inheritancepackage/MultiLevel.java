package inheritancepackage;

class Animal{ //parent class
	int a=5;
	public void animalmethod() {
		System.out.println("animal class method");
	}
}

class Dog extends Animal{ //child class of animal
	public void dogmethod() {
		System.out.println("dog class method");
	}
}

class Puppy extends Dog{ //child class of dog
	public void puppymethod() {
		System.out.println("puppy class method");
	}
}




public class MultiLevel {

	public static void main(String[] args) {
		Puppy obj=new Puppy();
		System.out.println("value of a: "+obj.a);  //calling parent class variable(animal) using child class object
		obj.animalmethod(); //calling parent class method(Animal) variable using child class object
		obj.dogmethod(); //calling parent class method(Dog) variable using child class object
		obj.puppymethod(); //calling child class(Puppy) variable using child class object

	}

}
