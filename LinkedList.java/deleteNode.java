
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class deleteNode {
    public static Node deleteAtBeginning(Node head) {
        Node current = head;
        head = head.next;
        current = null;
        return head;
    }

    public static Node deleteAtEnd(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public static Node deleteAtgiven(Node head, int possition) {
        Node current = head;
        Node previous = null;
        if (current == null) {
            return head;
        }
        if (possition == 1) {
            head = current.next;
            return head;
        }
        for(int i=1; current!=null && i<possition;i++){
            previous=current;
            current=current.next;
        }
        if(current!=null){
            previous.next=current.next;
        }
        else{
            System.out.println("data not present ");
        }
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head=deleteAtBeginning(head);
        printList(head);
        // head = deleteAtEnd(head);
        head=deleteAtgiven(head, 2);
        printList(head);

    }
}
