package interfaceEx2;
// One interface is extending by multiple interfaces
public class MainClass implements B,C{

	public static void main(String[] args) {
		MainClass m  = new MainClass();
		m.getA(6);
		m.getB(7);
		m.getC(8);

	}

	@Override
	public void getA(int a) {
		System.out.println("a = "+a);
		
	}

	@Override
	public void getC(int c) {
		System.out.println("c = "+c);
		
	}

	@Override
	public void getB(int b) {
		System.out.println("b = "+b);
		
	}

}
