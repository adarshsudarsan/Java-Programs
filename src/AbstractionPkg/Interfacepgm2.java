package AbstractionPkg;

interface TvRemote{
	abstract public void Poweron();
	abstract public void Poweroff();
}

interface smartTv extends TvRemote
{
	abstract public void display();
	
}
class Samsung implements smartTv{

	@Override
	public void Poweron() {
		System.out.println("poweron method");
	}

	@Override
	public void Poweroff() {
		System.out.println("poweroff method");		
	}

	@Override
	public void display() {
		System.out.println("display method");
		
	}
	
}

public class Interfacepgm2 {

	public static void main(String[] args) {
		
		Samsung obj=new Samsung();
		obj.Poweroff();
		obj.Poweron();
		obj.display();
		
	}

}
