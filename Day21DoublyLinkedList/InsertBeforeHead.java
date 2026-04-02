package Day21DoublyLinkedList;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class InsertBeforeHead {

    public static Node insertBeforeHead(Node head, int X) {

        // Step 1: Create new node
        Node newNode = new Node(X);

        // Step 2: Check if list is empty
        if (head == null) {
            return newNode;
        }

        // Step 3: Link new node with head
        newNode.next = head;
        head.prev = newNode;

        // Step 4: New node becomes head
        return newNode;
    }
}