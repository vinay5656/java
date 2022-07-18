package ifelse_statement;
import java.util.Scanner;
public class IfClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a%2==0 && b%2==0){
			int sum = a*b;
			System.out.println("sum = "+sum);
		}else {
			int sum = a+b;
			System.out.println("sum = "+sum);
		}
		
	}

}
