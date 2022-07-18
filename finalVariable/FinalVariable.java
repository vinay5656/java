package finalVariable;
class StaticFinalVariable{
	final static int mobile;//static in outer class
	
    static 
    {
		 mobile= 637746;
	}
    public static void get() {
    	System.out.println(mobile);
    }
	
}
class Ini_final_Var_constructor{
	final String Father;
	public Ini_final_Var_constructor() {
		this.Father = "Mukesh Chouhan";
		
	}
}

public class FinalVariable {
	final int AADAR_NO = 2428923;
	final String NAME;
	{
		NAME = "Vinay Chouhan";
	}
    final static int HOME_NO;//static variable in same class
	
    static 
    {
		 HOME_NO= 6;
	}

	public static void main(String[] args) {
		final String MOTHER ="Meena devi";
		
		FinalVariable a =new FinalVariable();
		
		Ini_final_Var_constructor b = new Ini_final_Var_constructor();
		
		System.out.println(a.AADAR_NO+"  "+a.NAME);
		System.out.println(MOTHER);
		System.out.println(b.Father);
		System.out.println(HOME_NO);
		StaticFinalVariable.get();
	}

}
