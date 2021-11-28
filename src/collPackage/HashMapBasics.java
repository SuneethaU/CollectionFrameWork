package collPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No Order-No Index
		//Stores values in Key value pair
		//Does not have any duplicate key value pairs
		//Hashap is not not threadsafe-un synchronized
		
		
		HashMap <String,String> capitalMap = new HashMap<String,String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "DC");
		capitalMap.put(null, "DC");
		//capitalMap.put(null, null);
		System.out.println(capitalMap.get(null));
		
		//1.Use Iterator over the keys:By Using keySet()-to traverse the HashMap 
		Iterator <String> it = capitalMap.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(capitalMap.get(it.next()));
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@");
		//2.Iterator over the set (pair)-By Using Entry Set
		Iterator <Entry<String,String>> it1= capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String,String> entry= it1.next();	
			System.out.println(" Key "+entry.getKey()+" value is "+entry.getValue())		;
			}
		System.out.println("@@@@@@@@@@@@@@@@@@");
		
		//3.Iterate Hash map using java 8 "for each and lambda"
		//capitalMap.forEach(k,v) -> System.out.println("key "+ k + " and value is "+v);
		
		
		
	}

}
