/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int i=0;
        int j=lists.length-1;
       return mergeK(lists,i,j);
    }
    public ListNode mergeTWO(ListNode left,ListNode right){
        if(left==null)
    {
      return right; 
     
    }
        if(right==null)
    {
         
            return left;
            
    }
    
        if(left.val<=right.val){
     
          left.next=mergeTWO(left.next,right);
          return left;
        }
  
        right.next=mergeTWO(left,right.next);
       
      return right;
    }
    public ListNode mergeK(ListNode[]Lists,int i,int j){
        int mid=(i+j)/2;
        if(i>j){
            return null;
        }
        if(i==j){
            return Lists[i];
        }
        
        
            ListNode left=mergeK(Lists,i,mid);
              ListNode right=mergeK(Lists,mid+1,j);
          return mergeTWO(left,right);
        

    }
}