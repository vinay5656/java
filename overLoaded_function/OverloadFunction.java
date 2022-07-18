package overLoaded_function;

import java.util.Scanner;



public class OverloadFunction {
	
	static int add(int x,int y) {
		return (x+y);
}
static int add(int x,int y,int z) {
	return x+y+z;
}

static double add(double x,double y) {
	return x+y;
}

static int product(int x,int y) {
	return x*y;
}

static double product(int x,double y) {
	return x*y;
}

static double product(double x,double y) {
	return x*y;
}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			int i = add(a,b);
			System.out.println(" i = "+i);
			int d = add(a,b,c);
			System.out.println(" d = "+d);
		
		double e =add(5.6,9.5);
		System.out.println(" e = "+e);
		int f = product(5, 7);
		System.out.println(" f = "+f);
		double g = product(5,7.8);
		System.out.println(" g = "+g);
		double h = product(4.2,9.4);
		System.out.println(" h = "+h);
		
		

	}

}
