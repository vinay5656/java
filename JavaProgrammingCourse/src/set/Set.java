package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
/**
 * Set only allows unique values.
 * LinkedHashSet retains the order in which they are stored.
 * Element are sorted in the sorted order in TreeSet and  HashSet.
 * */
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(2);
		set1.add(4);
		set1.add(4);
		set1.add(5);
		set1.add(6);set1.add(3); set1.add(9);set1.add(10);set1.add(5);set1.add(1);
		
		System.out.println(set1);
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("Vinay");
		set2.add("Ravi");
		set2.add("Bhavesh");
		set2.add("Loki");
		set2.add("Shray");
		
		System.out.println(set2);
		
	
		LinkedHashSet<Integer> set3 = new LinkedHashSet<Integer>();
		set3.add(234);
		set3.add(111);
		set3.add(55);
		set3.add(443);
		set3.add(512);
		set3.add(12);
		
		System.out.println(set3);
		
		//contains method : -
		System.out.println(set1.contains(4));
		//containsAll Method :-
		HashSet<Integer> set4 = new HashSet<Integer>();
		set4.add(2);
		set4.add(5);
		set4.add(6);
		System.out.println(set1.containsAll(set4));
		//retains Method: - 
		set1.retainAll(set4);
		System.out.println(set1);
		
		//removeAll method : -
		
		set1.removeAll(set4);
		System.out.println(set1);
		//isEmpty Method : - 
		
		System.out.println(set1.isEmpty());
		System.out.println(set4.isEmpty());
		
		// remove Method : -
		System.out.println(set2.remove("Vinay"));
		System.out.println(set2);
		
		// equals Method:-
		set1.addAll(set4);
		System.out.println(set1.equals(set4));
		
		//Size method:- 
		System.out.println(set1.size());
		System.out.println(set2.size());
		System.out.println(set3.size());
	}

}
