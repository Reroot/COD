package FireCode;

public class computeBinary {
	public static String computeBinary(int val) {
	    // ANYNUMBER = val/2+val%2, broken down by this formula 
	    if(val < 2) {
	        return Integer.toString(val);
	    } else {
	        return computeBinary(val/2) + computeBinary(val%2);
	    }
	}
//	Write a method to compute the binary representation of a positive integer. The method should return a string with 1s and 0s.
//
//			computeBinary(6) ==> "110"
//			computeBinary(5) ==> "101"
//
//			Note: Use the minimum number of binary digits needed for the representation (Truncate unnecessary trailing 0s).
//			computeBinary(5) ==> "0101" (incorrect)
//			computeBinary(5) ==> "101" (correct)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
