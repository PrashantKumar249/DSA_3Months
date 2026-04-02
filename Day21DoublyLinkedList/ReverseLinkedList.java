package Day21DoublyLinkedList;

/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/

class ReverseLinkedList {

    public ListNode reverseDLL(ListNode head) {

        // Edge case
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode temp = null;

        // Traverse list
        while (current != null) {

            // Swap prev and next
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to next node (important)
            current = current.prev;
        }

        // New head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}