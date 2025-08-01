class Node {
    int data;
    Node pre;
    Node next;

    Node(int data) {
        this.data = data;
        pre = null;
        next = null;
    }
}

public class circularLinkedList {

    public static void printList(Node last) {
        if (last == null) {
            return;
        }
        Node head = last.next;
        while (true) {
            System.out.print(head.data + "->");
            head = head.next;
            if (head == last.next)
                break;
        }
        System.out.println("null");
    }

    public static Node insertInEmptyList(Node last, int data) {
        if (last != null) {
            return last;
        }
        Node newNode = new Node(data);
        newNode.next = newNode;
        last = newNode;
        return last;
    }

    public static Node insertAtbeginning(Node last, int data) {
        Node newNode = new Node(data);
        if (last == null) {
            newNode.next = newNode;
            return newNode;
        }

        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    public static Node insertAtEnd(Node last, int data) {
        Node newNode = new Node(data);
        if (last == null) {
            newNode.next = newNode;
            return newNode;
        }
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    public static Node insertAtGiven(Node last, int data, int n) {
        Node newNode = new Node(data);
        if (last == null) {
            newNode = newNode.next;
            return newNode;
        }
        Node current = last.next;

        for (int i = 1; i < n && current != null; i++) {

            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return last;
    }

    public static void deleteAtBeginneing(Node last) {
        if (last == null) {
            System.out.println("this list is empty");
            return;
        }
        last.next = last.next.next;

    }

    public static Node deleteAtEnd(Node last) {
        if (last == null) {
            System.out.println("this list is empty");
            return null;
        }
        Node head = last.next;
        // Node previous = null;
        // while (true) {
        //     previous = current;
        //     current = current.next;
        //     if (current == last.next) {
        //         break;
        //     }
        // }
        // previous.next = current.next;
        //  last = previous;
        //   return last;
        Node current=head;
        while(current.next!=last){
            current=current.next;
        }
        current.next=head;
        last=current;
        return last;
       
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node last = new Node(3);
        // Node last=null;

        head.next = second;
        second.next = last;
        last.next = head;
        printList(last);
        // Node emptyList = insertInEmptyList(last, 5);
        Node IAtbeg = insertAtbeginning(last, 5);
        printList(IAtbeg);
        Node IAtEnd = insertAtEnd(IAtbeg, 10);
        printList(IAtEnd);
        Node Given = insertAtGiven(IAtEnd, 15, 2);
        printList(Given);
        deleteAtBeginneing(Given);
        printList(Given);
        Node dele = deleteAtEnd(Given);
        printList(dele);

    }
}
