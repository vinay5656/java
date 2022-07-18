package myConsturctor;

public class Consturctor {
    double Number_;
	String Name_;
	public Consturctor(double Number,String Name){
		Number_ = Number;
		Name_ = Name;
	}
	public void display() {
		System.out.println(Name_+" has a mobile number "+Number_);
	}

	public static void main(String[] args) {
	    Consturctor c = new Consturctor(63774698, "Vinay");
	    c.display();

	}

}
