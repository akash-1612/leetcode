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
    public int gcd(int a,int b)
    {
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode l=head;
        while(l.next!=null)
        {
            int gcd=gcd(l.val,l.next.val);
            ListNode n=new ListNode(gcd);
            n.next=l.next;
            l.next=n;
            l=l.next.next;
        }
        return head;
    }
}