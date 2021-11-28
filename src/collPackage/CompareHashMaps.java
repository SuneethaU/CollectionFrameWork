package collPackage;

import java.util.HashMap;

public class CompareHashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(2, "B");
		map2.put(1, "A");
		map2.put(3, "C");
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "D");
		
		//1.'On the basis of Key Value -use equals method'
		System.out.println(map1.equals(map2));//true
		System.out.println(map1.equals(map3));//false
		
		//2.Compare hashmaps for same keys:KeySet()
		System.out.println(map1.keySet().equals(map2.keySet()));//true
		System.out.println(map1.keySet().equals(map3.keySet()));//true
		
		
		//3.find out extra keys
		
		
		
		
	}

}
