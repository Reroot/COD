package FireCode;

import java.util.Hashtable;
import java.util.Set;

//Find the Number that Appears Once New
//Arrays Hash-Tables Numbers Miscellaneous   
//
//Your solution is incorrect. Click me for details.
//Write a method that returns a number that appears only once in an array.
//Assume the array will surely have a unique value. The array will never be empty.
//Examples:
//
//{1,2,3,4,1,2,4,3,5} ==> 5
public class singleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(single(new int[] {1, 1, 3}));
	}

	private static int single(int[] A) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
	    
	    int len = A.length - 1;
	    int number = 0;
	    for(int i = 0;i<=len;i++) {
	        if(hash.containsKey(A[i])) {
	            hash.put(A[i], hash.get((A[i]))+1);
	        } else {
	            hash.put(A[i], 1);
	        }
	    }
	    
	    Set<Integer> set = hash.keySet();
	    
	    for(Integer k : set) {
	        if(hash.get(k) == 1) {
	        	number = (int)k;
	        }
	    }

	    return number;
		
	}

}
