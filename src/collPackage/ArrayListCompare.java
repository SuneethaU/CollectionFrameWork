//equals,retainAll,RemoveAll
package collPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> S1 = new ArrayList<String>(Arrays.asList("A","B","C","E","G"));
		ArrayList<String> S2= new ArrayList<String>(Arrays.asList("A","B","C","E","G"));
		
		System.out.println(S1.equals(S2));
	}

}
