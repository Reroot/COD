package EasySetOne;

import java.util.HashMap;
import java.util.Set;

public class allUniqueCharsInAString {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	public static boolean areAllCharactersUnique(String str){
	        if(str == null) {
	            return true;
	        }
	        
			HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		    char[] A = str.toCharArray();
		    
		    for(int i = 0;i<A.length;i++) {
		        if(hash.containsKey(A[i])) {
		            hash.put(A[i], hash.get((A[i]))+1);
		        } else {
		            hash.put(A[i], 1);
		        }
		    }
		    
		    Set<Character> set = hash.keySet();
		    for(Character k : set) {
		        if(hash.get(k) != 1) {
		        	return false;
		        } 
		    }
		    return true;
	}
	
	public static void main(String[] args) {
		System.out.println(areAllCharactersUnique(new String("fakcqnjo")));
	}
}
