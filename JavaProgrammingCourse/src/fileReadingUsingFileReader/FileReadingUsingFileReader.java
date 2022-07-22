package fileReadingUsingFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class FileReadingUsingFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("example.txt");
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
		    br = new BufferedReader(fr);
			
		    String line;
		    while((line = br.readLine())!= null) {
		    	System.out.println(line);
		    }
		    
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				br.close();
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	

	}

}
