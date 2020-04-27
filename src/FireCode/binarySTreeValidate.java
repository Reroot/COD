package FireCode;

public class binarySTreeValidate {
	public static boolean validateBST(TreeNode root) {
	    return validateBSTX(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean validateBSTX(TreeNode root, int min, int max) {
	    if(root == null) {
	        return true;
	    }
	    if(root.data < min || max < root.data) {
	        return false;
	    }
	    return validateBSTX(root.left, min, root.data) && validateBSTX(root.right, root.data, max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
