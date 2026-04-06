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
class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // Step 1: Find length
        int length = 0;
        ListNode temp = head;
        
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        
        // Step 2: If head needs to be removed
        if (length == n) {
            return head.next;
        }
        
        // Step 3: Go to (length - n - 1) node
        temp = head;
        for (int i = 1; i < length - n; i++) {
            temp = temp.next;
        }
        
        // Step 4: Delete node
        temp.next = temp.next.next;
        
        return head;
    }
}