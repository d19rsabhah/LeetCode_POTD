class Maximum_Product_Of_Splitted_Binary_Tree_1339 {
    private long totalSum = 0;
    private long maxProduct = 0;
    private static final int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        calculateTotalSum(root);
        calculateMaxProduct(root);
        return (int)(maxProduct % MOD);
    }

    private long calculateTotalSum(TreeNode node) {
        if (node == null) return 0;
        totalSum += node.val;
        calculateTotalSum(node.left);
        calculateTotalSum(node.right);
        return totalSum;
    }

    private long calculateMaxProduct(TreeNode node) {
        if (node == null) return 0;

        long leftSum = calculateMaxProduct(node.left);
        long rightSum = calculateMaxProduct(node.right);

        long currentSum = node.val + leftSum + rightSum;
        long product = currentSum * (totalSum - currentSum);

        maxProduct = Math.max(maxProduct, product);
        return currentSum;
    }
}
