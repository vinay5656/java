package readingFileUsingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		 String filename = "C:/Users/chauh/Desktop/example.txt";
		String filename = "example.txt";
		// Create the object of filename file
		File newFile = new File(filename);
		// Read the file using scanner
		Scanner sc = new Scanner(newFile);
		int value = sc.nextInt();//it read the value and the crusher will just after value in file
		System.out.println("Read value: "+value);
		sc.nextLine();// to move the crusher to next line
		
		int count = 2;
		while(sc.hasNextLine()) {
//			System.out.println(sc.findInLine("one"));
			System.out.println(count+": "+sc.nextLine());
			count++;
		}
		
		
		sc.close();
		

	}

}
