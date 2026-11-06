package AbstractionPkg;

interface Bike{
	abstract public void speedlimit();
	public void accelarate();
}

class Honda implements Bike{

	@Override
	public void speedlimit() {
		System.out.println("Honda speed limit");
		
	}

	@Override
	public void accelarate() {
		System.out.println("Honda accelartion");		
	}
	
}

public class InterfacePgm {

	public static void main(String[] args) {
		Honda ob=new Honda();
		ob.speedlimit();
		ob.accelarate();
		
		
Bike obj=new Honda();
obj.speedlimit();
obj.accelarate();
		
	}

}
