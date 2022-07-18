package otherPackage;

import testPackage.Foundation;

public class OtherPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation outsidePackage = new Foundation();
		//outsidePackage.var1 = 1;
		//outsidePackage.var2 = 2;
		//outsidePackage.var3 = 3;
		outsidePackage.var4 = 4;
		/*
		 * We can see that only public member are visible out side the class
		 * except if that class inherited the Foundation class
		 * Protected member can be accessible
		 */
		//System.out.println(outsidePackage.var1);
		//System.out.println(outsidePackage.var2);
	    //System.out.println(outsidePackage.var3);
		System.out.println(outsidePackage.var4);

	}

}
