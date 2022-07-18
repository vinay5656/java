package staticKeyword;

import java.util.Scanner;

import staticKeyword.ClassA.ClassB;
import staticKeyword.ClassA.ClassC;

public class StaticKeywordimp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt()
;		ClassA obj1 = new ClassA();
//		ClassA.ClassB obj2 = obj1.new ClassB();
		ClassB obj2 = obj1.new ClassB();
		ClassA.ClassC obj3 = new ClassC();
		obj2.setA(p);
		System.out.println("a = "+obj2.getA());
		obj3.setB(q);
		System.out.println("b = "+obj3.getB());

	}

}
