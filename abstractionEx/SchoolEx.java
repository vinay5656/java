package abstractionEx;

public abstract class SchoolEx {
	public abstract void student(String name);
	public abstract void teacher(String name,String sub);
	public void schoolType(String type) {
		System.out.println("School is "+type);
	}
	
}
