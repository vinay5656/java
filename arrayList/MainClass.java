package arrayList;
import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		PairClass<String, Integer> Stock1 = new PairClass<String, Integer>("Mango",200);
		PairClass<String, Integer> Stock2 = new PairClass<String, Integer>("Orange",150);
		PairClass<String, Integer> Stock3 = new PairClass<String, Integer>("Pomegrende",150);
		PairClass<String, Integer> Stock4 = new PairClass<String,Integer>("papaya",25);
//		PairClass<String, Integer> pair = new PairClass<String,Integer>("Vinay Chouhan",101803296);
//		PairClass<String, Double> pairs = new PairClass<String,Double>("Vinay Chouhan",88.7);
//		pair.Display();
//		pairs.Display();
		Stock1.Display();
		Stock2.Display();
		Stock3.Display();
		Stock4.Display();

	}

}
