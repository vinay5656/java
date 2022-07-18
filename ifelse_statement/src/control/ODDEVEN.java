package control;
import java.util.Scanner;
public class ODDEVEN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("even number:"+n);
		}else {
			System.out.println("odd number:"+n);
		}
	}

}
