package arrayList;

import java.util.ArrayList;

public class ArrayListObservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		// List.add(value)
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		// list.add(index,value);
		list.add(2, 67);

		int count = 0;
		for (int l : list) {
			System.out.println(count + ": " + l);
			count++;
		}

		System.out.println(list.contains(4));
		System.out.println(list.contains(7));

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(list);

		for (int l : list2) {
			System.out.println(l);
		}

		System.out.println("Size " + list2.size());
		list2.remove(2);
		list2.remove(4);
		count = 0;
		for (int l : list2) {
			System.out.println(count + ": " + l);
			count++;
		}
		System.out.println("Size " + list2.size());

		list.clear();
		System.out.println("Size " + list.size());

		list2.set(1, 100);
		list2.set(2, 1000);
		count = 0;
		for (int l : list2) {
			System.out.println(count + ": " + l);
			count++;
		}
		
		list.addAll(list2);
		System.out.println(list2.equals(list)); 
		
		System.out.println(list.indexOf(100)); 
		
		System.out.println(list.toString());

	}

}
