package Easy;

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;
	TreeNode(int x, TreeNode l, TreeNode r) {
		this.data = x;
		this.left = l;
		this.right = r;
	}
}

public class treeNumOfLeaves {
	public int numOfLeaves(TreeNode root) {
		if(root == null) return 0;
		if(root.left == null && root.right == null) return 1;
		else //chained!
		return numOfLeaves(root.left) + numOfLeaves(root.left);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Write a function to find the total number of leaf nodes in a binary tree. A node is described as a leaf node if it doesn't have any children. If there are no leaf nodes, return 0.
//Example:  
//       1
//      / \
//     2   3     
//    / \ / \
//   4  5 6  7
//  / \
// 8   9     
//==> no. of leaves = 5