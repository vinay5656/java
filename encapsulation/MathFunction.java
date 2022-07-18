package encapsulation;

import java.util.Scanner;

public class MathFunction {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Dividion d = new Dividion();
		ADDITION obj1 = new ADDITION();
		Multiplication obj2 = new Multiplication();
		int a =sc.nextInt();
		int b =sc.nextInt();
		float m = sc.nextFloat();
		float n = sc.nextFloat();
		int x = obj1.addition(a,b);
		System.out.println("x = "+x);
		float y = obj2.Product(m,n);
		System.out.println("y = "+y);
		float z = d.Divide(m,n);
		System.out.println("z = "+z);
		

	}

}
