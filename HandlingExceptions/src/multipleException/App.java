package multipleException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
	void runCode() throws OutOfMemoryError,FileNotFoundException,IOException/*Exception*/{
//		throw new Exception();
		throw new FileNotFoundException();
	}

}
