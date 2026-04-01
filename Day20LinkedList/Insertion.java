//package Day20LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion {

    Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Insertion list = new Insertion(); // ✅ yaha bhi same naam

        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);

        list.display();
    }
}