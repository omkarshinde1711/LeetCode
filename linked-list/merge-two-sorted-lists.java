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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)return list2;
        if(list2 == null) return list1;
        //made a sample list so we can add nodes to it
        //and point it to the head of List1 
        ListNode Sample = new ListNode();
        Sample.next = list1;

        //3 helping hands
        ListNode prev1 = Sample;
        ListNode curr1 = list1;
        ListNode curr2 = list2;

        //step3-
        while (curr2 != null){
            //list 1 ke small elements ko find karte hai
            while(curr1 != null && curr1.val < curr2.val){
                prev1 = curr1;
                curr1=curr1.next;
            }

            //okay now correct spot to add curr2 into list1 mil gaya
            ListNode temp = curr2.next;
            curr2.next =curr1;
            prev1.next = curr2;
            curr2 = temp;
        
            //reset the postion of prev1 and curr1 
            prev1 = prev1.next;
            curr1 = prev1.next;
        }
        return Sample.next;
    }
}