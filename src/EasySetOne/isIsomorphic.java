package EasySetOne;

import java.util.*;

public class isIsomorphic {
//	Given two strings - input1 and input2, determine if they are isomorphic.
//	Two strings are isomorphic if the letters in one string can be remapped to get the second string. Remapping a letter means replacing all occurrences of it with another letter. The ordering of the letters remains unchanged. You can also think of isomorphism as it is used in chemistry - i.e. having the same form or overall shape. Target linear time and space complexity with your solution.
//
//	Examples:
//	Input 1 : css  
//	Input 2 : dll
//	Output  : true
//
//	Input 1 : css 
//	Input 2 : dle
//	Output  : false
//
//	Input 1 : abcabc 
//	Input 2 : xyzxyz
//	Output  : true
//
//	Input 1 : abcabc 
//	Input 2 : xbexyz
//	Output  : false
	public static boolean isIso(String s1, String s2) {
		//use char to match with the count of the other
		if(s1.length() != s2.length()) return false;
		Hashtable<Character, Integer> hs1 = new Hashtable<Character, Integer>();
		Hashtable<Character, Integer> hs2 = new Hashtable<Character, Integer>();
		for(int i = 0;i<s1.length();i++) {
			hs1.put(s1.charAt(i), hs1.getOrDefault(s1.charAt(i), 1) + 1);
			hs2.put(s2.charAt(i), hs2.getOrDefault(s2.charAt(i), 1) + 1);
			//during
			if(hs1.get(i) != hs2.get(i)) {
				return false;
			}
		}
		return true;
		//hash table sorts the order
//		Collection<Integer> ss1 = hs1.values();
//		Collection<Integer> ss2 =  hs2.values();
		//use equals to check the values
//		for(char c : ss1) {
//			if(hs1.get(c) != hs2.get(c)) { 
//				return false;
//			}
//		}
//		return ss1.equals(ss2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
