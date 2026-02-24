/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Sum_Of_Root_To_Leaf_Binary_Numbers_1022 {
    public int sumRootToLeaf(TreeNode root) {
        return findDFS(root, 0);
    }

    public int findDFS(TreeNode node, int curr) {
        if (node == null) {
            return 0;
        }
        curr = curr << 1 | node.val;
        if (node.left == null && node.right == null) {
            return curr;
        }
        int leftSum = findDFS(node.left, curr);
        int rightSum = findDFS(node.right, curr);

        return leftSum + rightSum;
    }
}