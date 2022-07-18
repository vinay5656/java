package testPackage;

public class Foundation {
	private int var1;
	int var2;
	protected int var3;
	public int var4;
	
	public static void main(String []args) {
		/*
		 * We will see that private, default, public and protected
		 * all variable are visible inside the class.
		 */
		Foundation insideTheClass = new Foundation();
		insideTheClass.var1 = 8;
		insideTheClass.var2 = 9;
		insideTheClass.var3 = 10;
		insideTheClass.var4 = 2;
		System.out.println(insideTheClass.var1);
		System.out.println(insideTheClass.var2);
		System.out.println(insideTheClass.var3);
		System.out.println(insideTheClass.var4);
	}

}
