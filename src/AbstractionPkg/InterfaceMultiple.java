package AbstractionPkg;
interface bikedetails
	{
	abstract public void color();
	abstract public void speed();
	
	}
interface vehicle
	{
	abstract public void model();
	}
//class Yamaha
//{
	class Yamaha implements bikedetails,vehicle{

		@Override
		public void model() {
			System.out.println("model method");
			
		}

		@Override
		public void color() {
			System.out.println("color method");
			
		}

		@Override
		public void speed() {
			System.out.println("speed method");
			
		}
		
	}
//}






public class InterfaceMultiple {

	public static void main(String[] args) {
		
		Yamaha obj=new Yamaha();
		obj.model();
		obj.color();
		obj.speed();
	}

}
