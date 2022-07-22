package genericsAndWildcard;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Kiwi");
		
		showArrayListString(list);
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		number.add(9);number.add(10);
		number.add(11);
        System.out.println(number.get(0)+" retrived number.");
		
		//showArrayList(number); doesn't work because of type
		showArrayListNumber(number);
		
		// for different generic type we have to create different showArrayListString or showArrayListNumber function
		// to avoid it we use wild cards
		// Wild card : - I am going to define a showArrayList function for all type.
		showArrayList(number);
		showArrayList(list);
		
		// Array list for classes or user define type
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person());
		personList.add(new Person());
		personList.add(new Person());
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		// I can also use showArrayList() function for both personList or studentList.
		// Because i defined showArrayList() using wild card "?"
		
		showArrayList(personList);
		showArrayList(studentList);
		
		personList.get(1).canEat();
		personList.get(2).canLook();
		
		//showArrayList2()
		showArrayList2(personList);
		showArrayList2(studentList);
		
		//showArrayList3()
		showArrayList3(personList);
		showArrayList3(studentList);
		
	}
	
	public static void showArrayListString(ArrayList<String> list) {
		for(String fruit : list) {
			System.out.println(fruit+": fruit");
		}
	}
	
	public static void showArrayListNumber(ArrayList<Integer> list) {
		for(Integer number : list) {
			System.out.println(number+": Number");
		}
	}
	
	public static void showArrayList(ArrayList<?> list) {
		for(Object object : list) {
			System.out.println(object);
		}
	} 
	
	public static void showArrayList2(ArrayList<? extends Person> list) {
		for(Object object : list) {
			System.out.println(object);
		}
	}
	
	public static void showArrayList3(ArrayList<? super Student> list) {
		for(Object object : list) {
			System.out.println(object);
		}
	}

}
