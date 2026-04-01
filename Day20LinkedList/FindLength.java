package Day20LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class FindLength {

    public static int findLength(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        int length = findLength(head);

        System.out.println("Length: " + length);
    }
}
