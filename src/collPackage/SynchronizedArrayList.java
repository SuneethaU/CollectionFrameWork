package collPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.'CopyOnWriteArrayList-its class-Thread safe-Synchronized already
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>(Arrays.asList("Suni","Ravi","Abhi"));
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*********");
	
//	2.Collections.synchronizedList
	
		List <String> namesList = Collections.synchronizedList(new ArrayList <String>(Arrays.asList("Suni","Ravi","Abhi")));
		namesList.add("Java");
		namesList.add("C");
		namesList.add("Selene");
		
		//synchronized(namesList) {
			
		//Add ,remove we don't need any explicit synchronization
		//To Fetch or traverse values from this list-we have to use the explicit synchronization
		
		Iterator <String> it1 = namesList.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	//}
	}
	
	
	
	
	
	

}
