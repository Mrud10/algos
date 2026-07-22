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
    public int countDominantNodes(TreeNode root) {
        if(root==null) return 0;
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list.size();
    }
    public void dfs(TreeNode root, List<Integer> list){
        if(root==null) return;
        int largest = largest(root);
            if(root.val == largest){
                list.add(root.val);
            }
        dfs(root.left,list);
        dfs(root.right,list);
    }
    public int largest(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        int leftMax = largest(root.left);
       int rightMax =  largest(root.right);
        return Math.max(root.val,(Math.max(leftMax,rightMax)));
    }
}