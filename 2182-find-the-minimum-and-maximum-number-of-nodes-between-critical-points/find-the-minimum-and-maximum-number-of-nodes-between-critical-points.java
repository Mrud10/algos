import java.util.*;
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int []result = new int[2];
        result[0]=-1;
        result[1]=-1;
        ListNode check = head;
        int len = 0;
        while(check!=null){
            len++;
            check = check.next;
        }
        if(len<=2){
            return result;
        }
        List<Integer> list = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nex = curr.next;
        int ind = 2;

        while(nex!=null){
            if(curr.val<prev.val && curr.val<nex.val){
                list.add(ind);
            }
            if(curr.val>prev.val && curr.val>nex.val){
                list.add(ind);
            }
            prev = prev.next;
            curr = curr.next;
            nex = nex.next;
            ind++;
        }
        if(list.size()<2){
            return result;
        }
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = 0;
        maxDistance = list.get(list.size()-1) - list.get(0);
        for(int i=1;i<list.size();i++){
            minDistance = Math.min(minDistance, list.get(i)-list.get(i-1));
        }
        result[0] = minDistance;
        result[1]=maxDistance;
        return result;
        
    }
}   