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
    public void flatten(TreeNode root) {
        if (root==null)return;

        TreeNode head = root;
        ArrayList <Integer> arr= new ArrayList<>();
        ///arr.add(head.val);
        solve (head , arr);

        //System.out.println(arr);

        // arraylist seh root ko jodna 
        for (int i=0;i<arr.size()-1;i++){
            root.val=arr.get(i);
            root.left=null;
            
            root.right= new TreeNode ();
            root = root.right;
        }
        root.val = arr.get(arr.size()-1);



        
    }
    void solve (TreeNode head,ArrayList <Integer> arr ){
        if (head == null){
            return;
        }
        arr.add(head.val);
        solve(head.left, arr);
        solve(head.right, arr);
    }
}