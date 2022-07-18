package School;

import School.Student.Student;
import School.Student.Teacter;

public class SchoolStructure {

	public static void main(String[] args) {
		Student obj1 = new Student();
		Teacter obj2 = new Teacter();
		obj1.setName_("Vinay Chouhan");
		obj1.setFees(10000);
		obj1.setRollNo(101803296);
		obj2.setNameTeacher("Ram");
		obj2.setSalaray(30000);
		obj2.setTeacher(67);
		System.out.println(obj1.getName_()+" has roll no. "+obj1.getRollNo()+" and his fees is "+obj1.getFees());
        System.out.println(obj2.getNameTeacher()+" has teacher code "+obj2.getTeacher()+" and taking "+obj2.getSalaray()+" salaray");
	}

}
