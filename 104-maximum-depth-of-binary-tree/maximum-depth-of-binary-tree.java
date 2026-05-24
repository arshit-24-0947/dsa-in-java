class Solution {
    public int maxDepth(TreeNode root) {
        
        // base case
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int ans = Math.max(left, right);

        return ans + 1;
    }
}