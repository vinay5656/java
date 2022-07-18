package arrayEx;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Row:");
		int Row = sc.nextInt();
		System.out.println("Enter number of Colunm:");
		int col = sc.nextInt();
		int[][] Arr1 = new int[Row][col];
		int[][] Arr2 = new int[Row][col];
		int[][] Arr3 = new int[Row][col];
		for(int i=0;i<Row;i++) {
			for(int j=0;j<col;j++) {
				Arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<Row;i++) {
			for(int j=0;j<col;j++) {
				Arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<Row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("  "+Arr1[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<Row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("  "+Arr2[i][j]+"  ");
			}
			System.out.println();
		}
		for(int i=0;i<Row;i++) {
			for(int j=0;j<col;j++) {
				Arr3[i][j]=Arr1[i][j]+Arr2[i][j];
			}
		}
		System.out.println();
		for(int i=0;i<Row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("  "+Arr3[i][j]+"  ");
			}
			System.out.println();
		}
		

	}

}
