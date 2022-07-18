package testPackage;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation outSideTheClassInsidePackage = new Foundation();
		//outSideTheClassInsidePackage.var1 = 1;
		outSideTheClassInsidePackage.var2 = 2;
		outSideTheClassInsidePackage.var3 = 3;
		outSideTheClassInsidePackage.var4 = 4;
		/* 
		 * We can see that private member are not visible outside the class even in same package.
		 * but default, public or protected is visible inside the same package or another class
		 */
		//System.out.println(outSideTheClassInsidePackage.var1);
		System.out.println(outSideTheClassInsidePackage.var2);
		System.out.println(outSideTheClassInsidePackage.var3);
		System.out.println(outSideTheClassInsidePackage.var4);

	}

}
