package AbstractionPkg;

interface BasicAnimal{
	void Eat();
	void Sleep();
}
class Monkey {
	public void Jump() {
		System.out.println("Monkey is jumping");
	}

	public void bites() {
		System.out.println("Monkey is bitting");
	}
}
	class Human extends Monkey implements BasicAnimal{
		public void speak() {
			System.out.println("Human is speaking");
		}

		@Override
		public void Eat() {
			System.out.println("Human is Eating");
		}

		@Override
		public void Sleep() {
			System.out.println("Human is sleeping");
		}	
		}	
public class Pgm3 {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.Jump();
		obj.bites();
		obj.Eat();
		obj.Sleep();
		obj.speak();
	}
	}