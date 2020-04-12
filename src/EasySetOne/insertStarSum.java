package EasySetOne;

public class insertStarSum {
	// try 1
	public static String insertPairStar(String s) {
	    if(s.length() == 0) return "";
	    if(s == null) return null;
	    
	        for(int i = 0;i<s.length();i++) {
	            if(s.charAt(i) == s.charAt(i+1)) {
	                return s.substring(0, 1) + "*" + s.substring(1,2);
	            } else if(s.charAt(i) != s.charAt(i+1)) {
	                return s.substring(0, 1) + s.substring(1,2);
	            } else {
	                return insertPairStar(s);
	            }
	        }
			return s;
	}
	//try 2
	public static String insertPairStar2(String s) {
	    if(s.length() == 0) return "";
	    if(s == null) return null;
	    if(s.length() == 1) return s;
	    if(s.substring(0, 1) == s.substring(1, 2)) return insertPairStar(s.substring(0, 1)) + "*" + insertPairStar(s.substring(1, 2));
	    else {
	        return insertPairStar(s.substring(0, 1)) + insertPairStar(s.substring(1, 2));
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
