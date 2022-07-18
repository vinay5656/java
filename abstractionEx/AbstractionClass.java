package abstractionEx;

import java.util.Scanner;

public class AbstractionClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrivateSchool ps = new PrivateSchool();
		GovermentSchool gs = new GovermentSchool();
//		String name = sc.nextLine();
//		String subName =sc.nextLine();
//		String schoolName =sc.nextLine();
//		String SchType = sc.nextLine();
		ps.schoolType(sc.nextLine());
		ps.schoolName = sc.nextLine();
		ps.student(sc.nextLine());
		ps.teacher(sc.nextLine(), sc.nextLine());
		gs.schoolType(sc.nextLine());
		gs.schoolName = sc.nextLine();
		gs.student(sc.nextLine());
		gs.teacher(sc.nextLine(), sc.nextLine());
		

	}

}
