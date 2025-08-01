class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class practiceLinkedList {

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node RemoveEveryK_th(Node head, int k) {
        Node current = head;
        Node previous = null;
        int next = 0;
        while (current != null) {
            next++;
            if (next % k == 0) {
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }

        return head;
    }

    public static int MiddleElement(Node head) {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        int mid = count / 2;
        Node pre = head;
        while (mid > 0) {
            pre = pre.next;
            mid--;
        }
        return pre.data;
    }

    public static int countOccurrence(Node head, int k) {
        Node current = head;
        int count = 0;
        while(current!=null){
            if(current.data==k){
                count++;
            }
            current=current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printList(head);
        // Node kth=RemoveEveryK_th(head, 2);
        // printList(kth);
        int middleElem = MiddleElement(head);
        System.out.println(middleElem);
        System.err.println(countOccurrence(head, 1));
    }
}
