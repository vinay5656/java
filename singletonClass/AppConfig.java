package singletonClass;

public class AppConfig {
	String Name;
	float roll;
	private AppConfig(String Name,int roll) {
		this.Name = Name;
		this.roll=roll;
	}
	private static AppConfig obj = new AppConfig("Vinay Chouhan", 64); //obj = null
	public static AppConfig getinstance() {
//		if(obj==null) {
//			obj = new AppConfig("whatever", whatever);
//		}
		return obj;
	}
}
