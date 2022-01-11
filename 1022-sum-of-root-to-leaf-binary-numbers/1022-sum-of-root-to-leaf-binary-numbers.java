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
    public int sumRootToLeaf(TreeNode root) {
        return height(root,0);
    }
    public int height(TreeNode root,int curr){
        if(root==null)return 0;
       int an=2*curr+root.val;
        
        if(root.left==null&&root.right==null){return an;}
       return height(root.left,an)+height(root.right,an);
    }
}