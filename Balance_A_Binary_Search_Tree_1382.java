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
class Balance_A_Binary_Search_Tree_1382 {
    List<Integer> inOrder = new ArrayList<>();
    public void findInOrder(TreeNode root){
        if(root == null){
            return;
        }
        findInOrder(root.left);
        inOrder.add(root.val);
        findInOrder(root.right);
    }

    public TreeNode buildBalancedBST(int l, int r){
        if(l > r){
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(inOrder.get(mid));
        root.left = buildBalancedBST(l, mid - 1);
        root.right = buildBalancedBST(mid + 1, r);
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        findInOrder(root);
        return buildBalancedBST(0, inOrder.size() - 1);
    }

}