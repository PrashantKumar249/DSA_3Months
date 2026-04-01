class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SearchLinkedList {

    // Function to search key
    public static boolean searchKey(ListNode head, int key) {
        ListNode temp = head;

        while (temp != null) {
            if (temp.val == key) {
                return true;   // key mil gaya
            }
            temp = temp.next; // next node
        }

        return false; // key nahi mila
    }

    // Display function (optional)
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create Linked List: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        display(head);

        int key = 3;

        boolean result = searchKey(head, key);

        if (result) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }
    }
}