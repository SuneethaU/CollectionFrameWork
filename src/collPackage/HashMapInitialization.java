package collPackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
	public static Map <String,Integer> MarksMap;
	static{
		MarksMap = new HashMap<>();
		MarksMap.put("A", 100);
		MarksMap.put("B", 200);
		MarksMap.put("C", 300);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.HashMap Class
		HashMap<String,String> map1 = new HashMap<>();
		Map<String,String> map2 = new HashMap<>();
		
		//2.Static HashMap
		System.out.println(HashMapInitialization.MarksMap.get("A"));
		
		//3.ImmutableMap with only one single entry
		
		Map<String,Integer> map3= Collections.singletonMap("test", 1000);
		System.out.println(map3.get("test"));
		
		//map3.put("abc", 200);//Exception in thread "main" java.lang.UnsupportedOperationException
		
		//4. JDK 8:
		//Creating one 2D array of Strings using Streams and Collecting in the form of map 
		Map<String,String> map4 =  Stream.of(new String[][]{
			
			{"TOM","A Grade"},	
			{"Mike","B Grade"},
			}).collect(Collectors.toMap(data->data[0],data->data[1]));
		System.out.println(map4.get("TOM"));
		map4.put("John", "C Grade");
		System.out.println(map4.get("John"));
		
		//5.USing SimpleEntry: Mutable Map
		Map<String,String> map5 = Stream.of(
					new AbstractMap.SimpleEntry<>("SUni","Testing"),
					new AbstractMap.SimpleEntry<>("Ravi","Dev")
					).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(map5.get("SUni"));
		map5.put("ABhi", "Architect");
		System.out.println(map5.get("ABhi"));
		
		
		//6.Using SimpleImmutableEntry:Immutable Map:
		Map<String,String> map6 =
		Stream.of(
				new AbstractMap.SimpleImmutableEntry<> ("Suni","JAVA"),
				new AbstractMap.SimpleImmutableEntry<> ("Ram","UKG")
				).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(map6.get("Suni"));
		
		//JDK 1.9
		//7.Empty Map
		Map<String,String> map7 = Map.of();
		//map7.put("Test", "QTP");//Unsupoorted exception
		
		//8.singleton Map
		Map<String,String> map8 =Map.of("K1","V1");
		System.out.println(map8.get("K1"));
		//map8.put("K2", "V2");//Unsupoorted exception
		
		//9.Multi Values Map:Max 10 pairs can be stored
		Map<String,String> map9 = Map.of("K1","V1","K2","V2","K3","V3");
		System.out.println(map9.get("K3"));
		
		//10.Multi values:No Limitation on pairs(key-valued)
		//Immutable Maps
		Map<String, Integer> map10=Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A",100),
				new AbstractMap.SimpleEntry<>("B",200),
				new AbstractMap.SimpleEntry<>("C",300)
				);
		System.out.println(map10.get("B"));
		//map10.put("D", 400);
		//System.out.println(map10.get("D"));
		
		//11.Maps using Guava--Need to add Guava Jar file\Dependency to XML file
		//Immutable Map
		//Map<String,String> Map11 = ImmutableMap.of("Google","Google India","Amazon","Amazon India");
		//System.out.println(map11.get("Google"));
		//Map11.put("Redif","Rediff India");//Unsupoorted exception
}
}
