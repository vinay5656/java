package pattern;
import java.util.Scanner;
public class pattern6 {
	public static void main() {
		Scanner var = new Scanner(System.in);
		int n = var.nextInt();
		int row =2*n-1;
		for(int i=1;i<=row;i++) {
			if(i<=n) {
				for(int j = 1;j<=i;j++) {
					System.out.print("* ");
				}
			}
			else {
				for(int j=1;j<=row-i+1;j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
