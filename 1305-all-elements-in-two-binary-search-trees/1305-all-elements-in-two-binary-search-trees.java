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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
            Queue<Integer>q1= new LinkedList();
         Queue<Integer>q2= new LinkedList();
        List<Integer>ans= new ArrayList<>();
        inorder(root1,q1);
        inorder(root2,q2);
        while(!q1.isEmpty()||!q2.isEmpty()){
            if(q1.isEmpty()){
            ans.add(q2.poll());
        }else if(q2.isEmpty()){
            ans.add(q1.poll());
        }else{
       ans.add(q1.peek()<q2.peek()?q1.poll():q2.poll());
            }}
        return ans;
        
    }
    public void inorder(TreeNode root, Queue<Integer>q){
        if(root==null){
            return;
        }
        inorder(root.left,q);
        q.add(root.val);
        inorder(root.right,q);
    }
}