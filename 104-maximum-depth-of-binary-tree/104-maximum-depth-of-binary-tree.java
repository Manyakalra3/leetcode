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
    public int maxDepth(TreeNode root) {
        int level=0;
        if(root==null){return 0;}
    LinkedList<TreeNode>q= new LinkedList();
         List<Integer>list= new ArrayList<>();
        q.add(root);
       
        while(q.size()!=0){
            
            int size=q.size();
            while(size-->0){
                TreeNode node= q.removeFirst();
            list.add(node.val);
            
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
            }
           
             level++;
        }
        for(int i:list)
        System.out.print(i+" ");
        return level;
    }
}