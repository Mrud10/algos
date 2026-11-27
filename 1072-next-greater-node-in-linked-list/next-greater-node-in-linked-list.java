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
    public int[] nextLargerNodes(ListNode head) {
        if(head==null) return new int[]{};
        int count = 0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            count++;
        }
        int [] result = new int[count];
        List<Integer> list = new ArrayList<>();
        ListNode it = head;
        while(it!=null){
            list.add(it.val);
            it = it.next;
        }
        int index = 0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(j)>list.get(i)){
                    result[i]=list.get(j);
                    index++;
                    break;
                }
            }
        }
        return result;
        
    }
}