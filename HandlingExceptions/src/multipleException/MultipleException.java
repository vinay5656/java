
package multipleException;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This program describe the how we can handle the multiple exception.
 * Case:1 Using single catch block.
 * Case:2 Using throws keyword
 * Case:3 Using multiple catch block mean define the separate catch block for each exception.
 * */

public class MultipleException {

	public static void main(String[] args)/* throws OutOfMemoryError, FileNotFoundException, IOException*/ {
		// TODO Auto-generated method stub
		App myApp = new App();
		/*
		// How to handle exception using single catch() block
	    try {
			myApp.runCode();
		} catch (OutOfMemoryError | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    */
		/* 
	      myApp.runCode();
	      using throws keyword
		*/
		try {
			myApp.runCode();
		} catch (OutOfMemoryError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
