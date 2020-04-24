package FireCode;

public class mergeTwoSortedArrays {
	public static int[] merge(int[] arrLeft, int[] arrRight){
		int[] merged = new int[arrLeft.length+arrRight.length];
		int lenRight = arrRight.length;
		int lenLeft = arrLeft.length;
		//3 indicies 
		int indleft = 0, indRight = 0, indMerged = 0;
		//sort the sorted by leftmost
		while(indleft < lenLeft && indRight < indRight) {//fill the array
			if(arrLeft[indleft++] < arrRight[indRight++]) {
				merged[indMerged++] = arrLeft[indleft++];
			} else {
				merged[indMerged++] = arrRight[indRight++];
			} 
		}
		while(indleft < lenLeft) {
			merged[indleft] = arrLeft[lenLeft];
		}
		while(indRight < lenRight) {
			merged[indleft] = arrLeft[lenLeft];
		}
		
		
		return merged;
	}

	public static void main(String[] args) {
		// rec
		

	}

}
