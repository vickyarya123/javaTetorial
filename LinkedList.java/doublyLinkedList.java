
class Node {
    int data;
    Node next;
    Node pre;

    Node(int val) {
        this.data = val;
        pre = null;
        next = null;
    }
}

public class doublyLinkedList {

    public static void forwardTraversal(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void forwardTraversalRecursive(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head.data + "<->");
        forwardTraversalRecursive(head.next);
    }

    public static void backwordTraverse(Node tail) {
        if (tail == null) {
            System.out.println("null");
            return;
        }
        while (tail != null) {
            System.out.print(tail.data + "<->");
            tail = tail.pre;
        }
        System.out.println("null");
    }

    public static void backwordTraverseRecursive(Node tail) {
        if (tail == null) {
            System.out.println("null");
            return;
        }
        System.out.print(tail.data + "<->");

        backwordTraverseRecursive(tail.pre);
    }

    public static int LengthOfList(Node head) {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static Node insertAtbeginning(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        if (head != null) {
            head.pre = newNode;
        }
        return newNode;
    }

    public static void insertAtEnd(Node head, int data) {
        Node current = head;
        Node newNode = new Node(data);

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.pre = current;
    }

    public static Node insertAtGiven(Node head, int data, int key) {
        Node newNode = new Node(data);
        Node current = head;
        if (key == 1) {
            newNode.next = head;
            if (head != null) {
                head.pre = newNode;
            }
            head = newNode;
            return newNode;
        }

        for (int i = 1; i < key && current != null; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.pre = newNode;
        current.next = newNode;
        newNode.pre = current;
        return head;
    }

    public static Node deleteAtbeginning(Node head) {
        if (head == null) {
            return null;
        }
        head.next.pre = null;
        head = head.next;
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
        while (current.next != null) {
            current = current.next;
        }
        if (current.pre != null) {
            current.pre.next = null;
        }
        return head;
    }

    public static Node deleteAtGiven(Node head, int key) {
        if (key == 0) {
            head = head.next;
            head.pre = null;
            return head;
        }
        Node current = head;
        Node previous = null;
        for (int i = 1; i < key && current != null; i++) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("out of bound");
            return head;
        }
        previous.next = current.next;
        current.next.pre = previous;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.pre = head;
        second.next = third;
        third.pre = second;
        third.next = fourth;
        fourth.pre = third;

        // System.out.println("forward and backword Traversla: ");
        forwardTraversal(head);
        // forwardTraversalRecursive(head);
        // backwordTraverse(third);
        // backwordTraverseRecursive(third);
        System.out.println("the lenght of the list is = " + LengthOfList(head));
        // Node hd = insertAtbeginning(head, 0);
        // forwardTraversal(hd);
        // insertAtEnd(head, 5);
        // Node hd = insertAtGiven(head, 10, 2);
        Node d = deleteAtGiven(head, 2);
        forwardTraversal(d);
    }
}