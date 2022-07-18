package abstractionEx;

public class GovermentSchool extends SchoolEx {
    String schoolName;
	@Override
	public void student(String name) {
		System.out.println(name+" is study in "+schoolName);
		
	}

	@Override
	public void teacher(String name, String sub) {
		System.out.println(name+" is teaching "+sub+" at "+schoolName);
		
	}
	

}
