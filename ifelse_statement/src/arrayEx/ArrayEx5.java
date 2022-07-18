package arrayEx;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Size of Array for section sort:");
		int n = sc.nextInt();
		int[] Arr = new int[n];
		for(int i=0;i<n;i++) {
			Arr[i]=sc.nextInt();
		}
		int count = 0;
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(Arr[min]>Arr[j]) {
					//min = j;
				
					int temp = Arr[j];
					Arr[j]=Arr[min];
					Arr[min]=temp;
					count++;
				}
			}
		}
		System.out.println();
		System.out.println(count);
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.println(Arr[i]+" ");
		}

	}

}
