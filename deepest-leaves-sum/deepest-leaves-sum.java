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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        int h= height(root);
        kdown(root,h);
        return sum;
    }
    public void kdown(TreeNode root,int d){
         if(root==null||d<0){
            return;
        }
        if(d==0){
        sum+=root.val;
        }
        kdown(root.left,d-1);
        kdown(root.right,d-1);
        
    }
    public int height(TreeNode root){
        if(root==null || root.right==null&& root.left ==null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        int n = Math.max(left,right)+1;
        return n;
    }
}