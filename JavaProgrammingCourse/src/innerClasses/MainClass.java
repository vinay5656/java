package innerClasses;

public class MainClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerClasses obj = new InnerClasses(401803006);
		obj.showInfo();
		
		InnerClasses.InnerNonStaticClass obj2 = obj.new InnerNonStaticClass("Bhavesh");
		obj2.showInfo();
		
//		InnerClasses obj3 = new InnerClasses(101213393);
		InnerClasses.InnerStaticClass obj4 = new InnerClasses.InnerStaticClass("Thapar University");
		obj4.showSchoolInfo();
//		obj4.description();

	}

}
