package inheritanceEx;

public class MainClass {

	public static void main(String[] args) {
		Student s = new Student();
	    Teacher t = new Teacher();
	    s.Name="Vinay Chouhan";
	    s.Home_no="25,Mukesh chouhan, Ladkhani Mohalla, Bardod, Behror";
	    t.Name="Devender Singh";
	    t.Home_no = "Thapar University, Patiala";
	    s.eat();
	    s.walk();
	    s.read();
	    t.eat();
	    t.walk();
	    t.Teach();

	}

}
