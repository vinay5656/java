package arrayEx;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int n = sc.nextInt();
		int[] Arr = new int[n];
		for(int i=0;i<n;i++) {
			Arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
		for(int i =0;i<n-1;i++) {
			if(Arr[i]>Arr[i+1]) {
				int temp =Arr[i];
				Arr[i]=Arr[i+1];
				Arr[i+1]=temp;
			}
		}
		}
		for(int i=0;i<n;i++) {
			System.out.println(Arr[i]+" ");
		}
	}

}
