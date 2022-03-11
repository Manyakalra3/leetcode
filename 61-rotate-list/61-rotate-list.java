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
    public ListNode rotateRight(ListNode head, int k) {
        
       if(head==null||head.next==null)
           return head;
        int len = length(head);
        // System.out.println(len);
        k= k%len;
        while(k>0){
            ListNode temp=head;
             while(temp.next.next!=null){
            temp=temp.next;
            }
            ListNode rotate=temp.next;
            temp.next=null;
            rotate.next=head;
            head=rotate;
            k--;
        }
        return head;
    }
    public int length(ListNode head){
        int len=0;
        while(head.next!=null){
            head=head.next;
            len++;
            
        }
        return len+1;
    }
}
