package innerClasses;

public class InnerClasses {
    private int id;
    //Constructor
	InnerClasses(int id){
		this.id = id;
	}
    
	public /*private: - MainClass won't able to access*/class InnerNonStaticClass{
		private String name;
		//Constructor
		InnerNonStaticClass(String name){
			this.name = name;
		}
		
		public void showInfo() {
			System.out.println("Name: "+name+" and "+"ID: "+id);
		}
	}
	
	public void showInfo() {
		InnerNonStaticClass  obj = new InnerNonStaticClass("Vinay");
		obj.showInfo();
				
		InnerStaticClass obj2 = new InnerStaticClass("Shiv Vidha Mandir");
		obj2.showSchoolInfo();
	}
	
	public static class InnerStaticClass{
		private String school;

		public InnerStaticClass(String school) {
			this.school = school;
		}
		
		public static void description() {
			System.out.println("I am static class method.");
		}
		
		public void showSchoolInfo() {
			System.out.println("My school is "+school);
//			System.out.println("My school is "+school+id);// Won't work due to static do not have access to instance variable or they are class type
		}
		
	}

   public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InnerNonStaticClass  obj = new InnerNonStaticClass("Vinay");//I cann't do this
		InnerClasses obj = new InnerClasses(1018032);
		obj.showInfo();
		
		InnerClasses.InnerNonStaticClass obj2 = obj.new InnerNonStaticClass("Ravi");
		obj2.showInfo();
		
		InnerStaticClass obj3 = new InnerStaticClass("Krishna Vidha Mandir");
		obj3.showSchoolInfo();
		InnerStaticClass.description();
		

	}
	

}
