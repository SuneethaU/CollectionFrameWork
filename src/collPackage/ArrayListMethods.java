package collPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> ar1 = new ArrayList<String>();
		ar1.add("S1");
		ar1.add("S2");
		ar1.add("S3");
		System.out.println("ar1"+ar1);
		
		ArrayList <String> ar2 = new ArrayList<String>();
		ar2.addAll(ar1);
		System.out.println("ar2"+ar2);
		
		ArrayList <String> ar3 = new ArrayList<String>();
		ar3.add("R1");
		ar3.add("R2");
		System.out.println("ar3"+ar3);
		ar3.addAll(2,ar2);
		System.out.println("ar3"+ar3);
		
		ar3.clear();
		System.out.println("ar3"+ar3);
		
		ArrayList <String> cl1= (ArrayList<String>)ar1.clone();
		System.out.println(cl1);
		
		System.out.println(ar1.contains("S1"));
		System.out.println(ar1.contains("X1"));
		
		System.out.println(ar1.indexOf("S1"));
		System.out.println(ar1.indexOf("W1"));
		
		ArrayList <Integer> an1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(an1);
		
		System.out.println(an1.lastIndexOf(2));
		
		an1.removeIf(num -> num%2 ==0);
		System.out.println(an1);
		
		ArrayList<String> s1 =new ArrayList<String>(Arrays.asList("Ton","Jon","Ton","Jimmy","Rummy"));
		s1.retainAll(Collections.singletonList("Ton"));
		System.out.println(s1);
		
		/*ArrayList <Integer> an2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
		System.out.println(an1);
		
		ArrayList <Integer> subList = new ArrayList<Integer>(an2.subList(0,12));
		System.out.println(subList);
		
		Object arr[]=subList.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o:arr) {
			System.out.println((Integer)o);
		}*/
		
	
		
 
	}

}
