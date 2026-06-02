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
    public List<Integer> largestValues(TreeNode root) {
        // queue
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        if (root == null) return arr;

        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()){
            TreeNode x = q.poll();
            if (x != null){
                arr.add(x.val);
                if (x.left!=null){
                    q.offer(x.left);
                }
                if (x.right!=null){
                    q.offer(x.right);
                }
                
                
            }
            if (x== null && q.isEmpty()==true){
                arr.add(-91778);
                break;
            }
            if (x==null){
                arr.add(-91778);
                q.offer(null);
            }

        }
        System.out.print(arr);

        // new arrlist 
        ArrayList <Integer> arrnew = new ArrayList<>();
        int large = Integer.MIN_VALUE;
        for (int i =0;i<arr.size();i++){
            if (arr.get(i)==-91778){
                arrnew.add(large);
                large =Integer.MIN_VALUE;
                continue;
            }

            if (arr.get(i)>large){
                large = arr.get(i);
                
            }

        }

        return arrnew;

        
    }
    
}