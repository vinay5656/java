package switchEx;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		System.out.println("please give us rating:");
		Scanner sc = new Scanner(System.in);
		int Rating = sc.nextInt();
        switch(Rating) {
        case 1:
        case 2:
        {
        	System.out.println("Bad rating");
        	break;
        }
        case 3:
        case 4:
        {
        	System.out.println("Good rating");
        	break;
        }
        case 5:{
        	System.out.println("Best rating");
        	break;
        }
        }
	}

}
