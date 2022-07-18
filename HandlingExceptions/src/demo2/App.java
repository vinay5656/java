package demo2;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File filename = new File("text.txt");
		// Because text.txt file does not exist it will throw the exception
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileReader fileReader = new FileReader(filename);
		} catch (Exception e) {
			//I can pass in catch block "FileNotFoundException e" for more specific
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
