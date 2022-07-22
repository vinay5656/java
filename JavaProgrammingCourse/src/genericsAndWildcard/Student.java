package genericsAndWildcard;

public class Student extends Person{

	@Override
	void canLook() {
		// TODO Auto-generated method stub
		System.out.println("Student can look.");
	}

	@Override
	void canEat() {
		// TODO Auto-generated method stub
		System.out.println("Student can eat.");
	}
	
	void canStudy() {
		System.out.println("Student can study.");
	}
	
    void canObserve() {
    	System.out.println("Student can Observe.");
    }

}
