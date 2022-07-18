package number;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater = "+a);
			}
			else if(a==c) {
				System.out.println("both are equal:"+a+" "+c);
			}
		}else if(b>a) {
			if(b>c) {
				System.out.println("b is greater :"+b);
			}
			else if(b==c){
				System.out.println("both b and c are equal:"+b+" "+c);
			}
			else {
				System.out.println("c is greater :"+c);
			}
		}else {
			System.out.println("all are equal :"+a+" "+b+" "+c);
		}
		sc.close();
	}


}
