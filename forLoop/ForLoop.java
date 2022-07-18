package forLoop;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
      System.out.println("enter an number to find prime or not:"); 
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();     
      for(int i=2;i<number;i++) {
    	  if(number%i==0){
    		  System.out.println("number is not prime:");
    		  break;
    	  }
    		  System.out.println("number is prime:"+number);
    	  
      }

	}	

}
