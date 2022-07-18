package arrayList;
import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> Roll_No = new ArrayList<Integer>();
		Roll_No.add(101803296);
		Roll_No.add(101803297);
		Roll_No.add(101803263);
		Roll_No.add(101803298);
		System.out.println(Roll_No);
		ArrayList<Integer> Marks = new ArrayList<Integer>();
		Marks.add(90);
		Marks.add(91);
		Marks.add(32);
		Marks.add(56);
		System.out.println(Marks);
		Roll_No.addAll(Marks);
		System.out.println(Roll_No);
		Marks.remove(2);
		System.out.println(Marks);
		System.out.println(Roll_No);
		Roll_No.remove(2);
		System.out.println(Roll_No);
		ArrayList<Integer> toremove = new ArrayList<Integer>();
		toremove.add(90);
		toremove.add(101803263);
		Roll_No.removeAll(toremove);
		System.out.println(Roll_No);
		Integer temp[] = new Integer[Roll_No.size()];
		Roll_No.toArray(temp);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

}
