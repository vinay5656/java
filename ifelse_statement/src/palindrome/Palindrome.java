package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner v2 = new Scanner(System.in);
		int num = v2.nextInt();
		int temp=num;
		int palindrome = 0;
		
		while(temp>0) {
			int disit =  temp%10;
			palindrome = palindrome*10+disit;
			temp =temp/10;
		}
		if(palindrome==num) {
			System.out.println(num+" is palindrome number");
		}
		else {
			System.out.println(num+" is not palindrome number");
		}

	}

}
