package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File filename = new File("text.txt");
		// Because text.txt file does not exist it will throw the exception
		@SuppressWarnings({ "unused", "resource" })
		FileReader fileReader = new FileReader(filename);
		
		
		}

}
