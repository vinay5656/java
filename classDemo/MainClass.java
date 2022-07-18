package classDemo;
class Vehicale{
	int number_vehicales;
	int number_seats;
	String Brand_Name;
	String Owner_name;
	public void Set_bName(String s) {
		Brand_Name=s;
	}
	public void set_oName(String p) {
		Owner_name=p;
	}
	public void display() {
		System.out.println(Owner_name+" has a "+Brand_Name+" car that car has "+number_vehicales+" vehicales and "+number_seats+" seats");
	}
}

public class MainClass {

	public static void main(String[] args) {
		Vehicale v1 = new Vehicale();
		Vehicale v2 = new Vehicale();
		
		v1.number_seats=10;
		v2.number_seats=4;
		v1.number_vehicales=4;
		v2.number_vehicales=4;
		v1.Set_bName("Toyota");
		v2.Set_bName("Alto");
		v1.set_oName("VIVEK CHAUHAN");
		v2.set_oName("VINAY CHOUHAN");
		v1.display();
		v2.display();
		

	}

}
