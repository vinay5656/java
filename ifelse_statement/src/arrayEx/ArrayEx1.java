package arrayEx;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student:");
		int n = sc.nextInt();
		int[] marks;
		marks = new int[n];
		for(int i=0;i<n;i++) {
			marks[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(marks[i]+" ");
		}
		marks[2]=74;
		marks[3]=83;
		int average =0;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum=sum+marks[i];
		}
		average =sum/n;
		System.out.println("average ="+average);

	}

}
