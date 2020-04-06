package Easy;

import java.util.Arrays;

/**
//You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.
//
//Example:
//
//Input image :  
//              1 1
//              0 0
//Modified to :   
//              0 0
//              1 1
 */
public class horizontalFlip {
	public static void main(String[] args) {

		flipH(new int[][] {{7,8,9},{4,5,6},{1,2,3}});
		flipH(new int[][] {{1,0,1},{1,0,1}});
		flipH(new int[][] {{0,0,1},{1,0,0}});
		flipH(new int[][] {{1}});
		flipH(new int[][] {{7,8,9},{4,5,6},{1,2,3}});

	}
	// record: fail but correct?
	private static void flipH(int[][] arr) {
		int row = arr.length - 1; int col = arr[0].length - 1; 
		//outward from 0,0 method, only need 
		//and form the end
		//half the rows
		int temp = 0;
		for(int i = 0;i<= row/2;i++) {
			for(int j = 0;j<=col;j++) {
				//i and j start form 0,0, and we can use rows and col as
				// n, n end swap
				temp = arr[i][j];
				//overwrite what we temped
				arr[i][j] = arr[row-1][j]; //the bottom level is accesed
				arr[row-1][j] = temp;
				//0
				//1 <-
			}
		}
        for (int[] r : arr) {
            // converting each row as string 
            // and then printing in a separate line 
            System.out.println(Arrays.toString(r));

        }
		
	}

}
