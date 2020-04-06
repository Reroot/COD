package Easy;

public class verticalFlip {

	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	public static void flipItVerticalAxis(int[][] matrix) {
	    int row = matrix.length-1;//down rows y->
	    int col = matrix[0].length-1;//right cols x->
	    //if we revese start row one with end row one we get out answer
	    //only need to go through half the cols though
	    
	    for(int i = 0;i<=row;i++) {//i -- row control, start at 1st row, 1st iter
	        for(int j =0;j<=col/2;j++) { // j -- col control only half, a reverse swap from the back
	            //so first reverse the first row, first iter, col/2 times.
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[i][col-j];
	            matrix[i][col-j] = temp;
	        }
	    }
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
