package Day21DoublyLinkedList;

/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class DeleteHead {

    public ListNode deleteHead(ListNode head) {

        // Case 1: empty list
        if (head == null) {
            return null;
        }

        // Case 2: only one node
        if (head.next == null) {
            return null;
        }

        // Case 3: move head forward
        head = head.next;

        // remove backward link
        head.prev = null;

        return head;
    }
}
