package encapsulationandexception;

class Employee{
	private int id=5;
	private String name="adarsh";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EncapsulationPgm {

	public static void main(String[] args) {
		Employee obj=new Employee();
		//System.out.println("value of id:"+obj.id); //id is a private variable so can't call from another class
		System.out.println("Value of id: "+obj.getId()); //to print the value
		obj.setId(10); //to update the value
		System.out.println("Value of id after updation: "+obj.getId());
		
		System.out.println("Value of id: "+obj.getName());
		obj.setName("vismaya");
		System.out.println("Value of id after updation: "+obj.getName());
	}

}
