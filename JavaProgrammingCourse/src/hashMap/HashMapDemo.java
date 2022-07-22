package hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * LinKedHashMap retains the order in which element are added
 * TreeMap elements are sorted naturally (in ascending order). However, we can also customize the ordering of keys.
 * */

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Vinay");
		map.put(2, "Ravi");
		map.put(3, "Bhavesh");
		map.put(4,"Loki");
		map.put(5, "Shrey");
		map.put(15, "Givam");
		map.put(10, "Seema");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" : "+value);
		}
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Vinay"));
		
		System.out.println("Value at key 5: "+map.get(5));
		
		TreeMap<Integer,String> map2 = new TreeMap<>();
		map2.put(10, "Vinay");
		map2.put(2, "Ravi");
		map2.put(32, "Bhavesh");
		map2.put(4,"Loki");
		map2.put(15, "Shrey");
		
		LinkedHashMap<Integer,String> map3 = new LinkedHashMap<>();
		map2.put(10, "Vinay");
		map2.put(2, "Ravi");
		map2.put(32, "Bhavesh");
		map2.put(4,"Loki");
		map2.put(15, "Shrey");
		System.out.println("Testing map order on the basis of the type....");
		System.out.println("HashMap");
		testOrder(map);
		System.out.println("TreeMap");
		testOrder(map2);
		System.out.println("LinkedHashMap");
		testOrder(map3);
		
	}
	
	public static void testOrder(Map<Integer, String> map) {
//		for(Map.Entry<Integer,String> m : map.entrySet()) {
//			System.out.println(m.getKey()+" : "+m.getValue());
//		}
		
      for(int key : map.keySet()) {
    	  System.out.println(key);
      }
      for(String value : map.values()) {
    	  System.out.println(value);
      }
		
	}

}
