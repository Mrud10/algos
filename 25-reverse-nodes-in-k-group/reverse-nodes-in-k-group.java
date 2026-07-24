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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return null;
        ListNode curr = head;
        int num = k;
        while(num>0 &&  curr!=null){
            curr = curr.next;
            num--;
        }
        if(num > 0) return head;
        ListNode prev = null
        ;
        ListNode temp = head;
        for(int i=0;i<k;i++){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head.next = reverseKGroup(curr,k);
        return prev;
    }
}

// //babisan //ode hahah is it glithcing itts not ur fumba
// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
    
//     }
// }
      
//         if(head=null)return null;
//            ListNsode  n=nehead;
//         int s=0;
//         while()s<k && n!=null
//         {}
            
//   s++;
//              n=n.next;     
//         whiListNode c=head;
//         ListNode p=c;
//         while
//         (if(s<k) return head;)c!=n
//         {}
            
//         ListNode r=c.next;
//             c.next=p;
//             cp=c;
//             c=r;
//         head.next=reverseKGroup()n,k;
//         return p;