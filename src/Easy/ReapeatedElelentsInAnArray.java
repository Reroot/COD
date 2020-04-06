package Easy;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
//Write a method duplicate to find the repeated or duplicate elements in an array.
//This method should return a list of repeated integers in a string with the elements sorted in ascending order (as illustrated below).
//
//
//duplicate({1,3,4,2,1}) --> "[1]"
//
//duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"
//
//
//
//Note: You may use toString() method to return the
//standard string representation of most data structures, and
//Arrays.sort() to sort your result.
public class ReapeatedElelentsInAnArray {
//	Runtime Complexity
//	O(n log(n))

	public static String duplicate(int[] numbers){
	 //we should use treemap for this as treemap sorts, as we put elements int
	 //the iterate and filter the treemap  
		TreeMap<Integer, Integer> treeM = new TreeMap<Integer, Integer>();
	    for(int i = 0;i<numbers.length;i++) {
	        if(treeM.containsKey(numbers[i])) {//key is the numvalue, value is the count of it
	            treeM.put(numbers[i], treeM.get(numbers[i])+1);
	        } else {
	            treeM.put(numbers[i], 1);
	        }
	    }

	    Set<Integer> set = treeM.keySet();
	    //StringBuilder sb = new StringBuilder();
	    ArrayList<Integer> ls = new ArrayList<Integer>();
	    
	    for(Integer i : set) {
	        if(treeM.get(i) > 1) { //means we have dups
	            ls.add(i);
	        }
	    }
//	    for(Integer i : ls) {
//	        sb.append(i);
//	    }
	    return ls.toString();
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


