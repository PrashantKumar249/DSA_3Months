package Day25;

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
class LeetCode328 {
    public ListNode oddEvenList(ListNode head) {
        
        if (head == null) return null;

        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;

        ListNode temp = head;
        int index = 1;

        while (temp != null) {
            
            if (index % 2 == 1) {
                // odd index
                if (oddHead == null) {
                    oddHead = oddTail = new ListNode(temp.val);
                } else {
                    oddTail.next = new ListNode(temp.val);
                    oddTail = oddTail.next;
                }
            } else {
                // even index
                if (evenHead == null) {
                    evenHead = evenTail = new ListNode(temp.val);
                } else {
                    evenTail.next = new ListNode(temp.val);
                    evenTail = evenTail.next;
                }
            }

            temp = temp.next;
            index++;
        }

        // connect odd and even
        oddTail.next = evenHead;

        return oddHead;
    }
}