package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StringLenghtComparator implements Comparator<String>{

	@Override
	public int compare(String firstString, String secondString) {
		// TODO Auto-generated method stub
		int fslength = firstString.length();
		int sslength = secondString.length();
		
		if(fslength>sslength) {
			return 1;
		}else if(fslength<sslength) {
			return -1;
		}
		return 0;
	}
	
	
}

class AlphabetialComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

class Animals{
	private String animalName;

	public Animals(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
}

class AnimalsAlphabetialComparator implements Comparator<Animals>{
	public int compare(Animals o1, Animals o2) {
		return o1.getAnimalName().compareTo(o2.getAnimalName());
	}

}


public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //////////////////Sorting the Number //////////////////	
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(32);
		list1.add(13);
		list1.add(3);
		list1.add(333);
		list1.add(331);
		list1.add(2);
		
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		/////////////////// Sorting the string//////////////////
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Cat");
		list2.add("Dog");
		list2.add("Lion");
		list2.add("Elephant");
		list2.add("Zebra");
		list2.add("snake");
		
		Collections.sort(list2);
		
		System.out.println(list2);
		
        ///////////////Sorting Class type/////////////////
		ArrayList<Animals> list3 = new ArrayList<Animals>();
		Animals a1 = new Animals("Cat");
		Animals a2 = new Animals("Dog");
		Animals a3 = new Animals("Donkey");
		Animals a4 = new Animals("Snale");
		Animals a5 = new Animals("Lion");
		Animals a6 = new Animals("Parrot");
		
		list3.add(a1);
		list3.add(a2);list3.add(a3);
		list3.add(a4);list3.add(a5);list3.add(a6);
		
		Collections.sort(list3, new AnimalsAlphabetialComparator());
		for(Animals animal : list3) {
			System.out.println(animal.getAnimalName());
		}
		
		////////////// Sorting string list using customize Comparator/////////////
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Vinay");
		list4.add("Bhavesh");
		list4.add("Shray");
		list4.add("Loki");
		list4.add("Ujjwal");
		list4.add("Ramnatham");
		
		Collections.sort(list4,new StringLenghtComparator());
		System.out.println(list4);
		
		///////////////// Sorting string list using customize Comparator////////////
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("Vinay");
		list5.add("Bhavesh");
		list5.add("Shray");
		list5.add("Loki");
		list5.add("Ujjwal");
		list5.add("Ramnatham");
		
		Collections.sort(list5, new AlphabetialComparator());
		System.out.println(list5);
	
	}

}
