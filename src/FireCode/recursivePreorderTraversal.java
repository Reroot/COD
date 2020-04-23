package FireCode;

import java.util.ArrayList;

public class recursivePreorderTraversal {
public static ArrayList<Integer> preOrderedList = new ArrayList<Integer>();
	public void recursivePreorderTraversal(TreeNode root) {
		if(root != null) {
			preOrderedList.add(root.data);
			recursivePreorderTraversal(root.left);
			recursivePreorderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Pre-order traversal
//1. Add the data of the current node to the Arraylist.
//2. Traverse the left subtree by recursively calling the preorder method.
//3. Traverse the right subtree by recursively calling the preorder method.