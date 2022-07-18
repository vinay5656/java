package interfaceEx3;
//more then one interfaces is extending by one interface
public class MainClass implements A {

	public static void main(String[] args) {
		MainClass n = new MainClass();
		n.getA(1);
		n.getB(2);
		n.getC(3);

	}

	@Override
	public void getB(int b) {
		System.out.println("b = "+b);
		
	}

	@Override
	public void getC(int c) {
		System.out.println("c = "+c);
		
	}

	@Override
	public void getA(int a) {
		System.out.println("a = "+a);
		
	}

}
