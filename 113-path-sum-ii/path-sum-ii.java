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
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> arr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        solve(root,arr, targetSum,result);
        return result;
    }
    public void solve(TreeNode root, ArrayList<Integer> arr , int targetSum,List<List<Integer>>result ){
        if (root==null)return;
           arr.add(root.val);
        if (root.left == null && root.right== null){
            int total=0;
            for(int i =0; i<arr.size();i++){
                total=total+arr.get(i);

            }
            if (total==targetSum){
            result.add(new ArrayList<>(arr));

            }

        }
        solve(root.left, arr, targetSum, result);
        solve(root.right, arr, targetSum , result);
        // backtrack
        arr.remove (arr.size()-1);

    }
}