package collPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Using LinkedHashSet class
		ArrayList <Integer> numList = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3));
		LinkedHashSet <Integer> hashSet = new LinkedHashSet <Integer>(numList);
		System.out.println(hashSet);
		
		//2.JDK 8-Java Stream
		ArrayList <Integer> numList1 = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3,4,5,4));
		List<Integer> numList1Unique = numList1.stream().distinct().collect(Collectors.toList());
		System.out.println(numList1Unique);
		
	}

}
