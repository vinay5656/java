package singletonClass;

public class AccessorOfsSIngletonClass {

	public static void main(String[] args) {
		AppConfig obj1 = AppConfig.getinstance();
		AppConfig obj2 = AppConfig.getinstance();
		AppConfig obj3 = AppConfig.getinstance();
		System.out.println(obj1.Name+",  "+obj1.roll);
		System.out.println(obj2.Name+",  "+obj2.roll);
		System.out.println(obj3.Name+",  "+obj3.roll);
		}

}
