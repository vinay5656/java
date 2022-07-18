package runtimeException;

public class RuntimeException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int fNumber = 0;
        int sNumber = 23;
        
        try {
        	int result = sNumber/fNumber;
        	System.out.println(result);
        }catch(Exception e) {
        	System.out.println(e.toString());
        }
        
        
        
        String text = null;
        
        try {
        	System.out.println(text.length());
        }catch(Exception e) {
        	System.out.println(e.toString());
        }
        
        
        
        String [] names = new String[4];
        try {
        	names[0] = "Vinay";
            names[1] = "Ravi";
            names[2] = "Bhavesh";
            names[3] = "Loki";
            names[4] = "Ujjwal";
        }catch(Exception e) {
        	System.out.println(e.toString());
        }
        

	}

}
