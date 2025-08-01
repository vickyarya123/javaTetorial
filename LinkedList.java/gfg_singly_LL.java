
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class gfg_singly_LL {

    public static void traverseLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;

        }
        System.out.println("null");
    }

    public static void travesalLinkedListByRecursive(Node head) {
        Node current = head;
        if (current == null) {
            System.out.println();
            return;
        }
        System.out.print(current.data + "->");
        travesalLinkedListByRecursive(current.next);

    }

    public static boolean searchElementLinkedList(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;

            }
            current = current.next;

        }
        return false;
    }

    public static boolean searchElementByrecursive(Node head, int key) {
        Node current = head;
        if (current == null) {
            return false;
        }
        if (current.data == key) {
            return true;
        }

        // current=current.next;
        return searchElementByrecursive(head.next, key);
    }

    public static void LengthOfLinkedList(Node head) {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        // current=current.next;
        System.out.println(count);
    }

    public static int LengthByRecursive(Node head) {
        Node current = head;
        int count = 0;
        if (current == null) {
            return 0;
        }
        return 1 + LengthByRecursive(current.next);

    }

    public static Node insertionBeginning(Node head, int newData) {
        Node new_Node = new Node(newData);
        new_Node.next = head;
        return new_Node;
    }

    public static void insertionAtEnd(Node head, int newData) {
        Node new_node = new Node(newData);

        if (head == null) {
            head = new_node;
            return;
        }
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
        // new_node.next=null;
    }

    public static void deleteFromLast(Node head) {
        Node current = head;
        Node nextNode = current.next;

        while (current != null) {
            current = current.next;
            nextNode = current.next;
        }
    }

    public static Node insestAfterGiven(Node head, int key, int newData) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                break;
            }
            current = current.next;
        }
        if (current == null) {
            return head;
        }
        Node newNode = new Node(newData);
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static Node insertBeforeGiven(Node head, int key, int newData) {
        Node new_Node = new Node(newData);
        if (head == null) {
            return null;
        }
        if (head.data == key) {
            new_Node.next = head;
            return new_Node;
        }
        Node current = head;
        Node previous = null;

        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current != null) {
            previous.next = new_Node;
            new_Node.next = current;
        }
        return head;
    }

    public static void insertAtGiven(Node head, int key, int data) {
        Node newNode = new Node(data);
        if (key == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; i < key - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("possition is out of bounds.");
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        // traverseLinkedList(head);
        // travesalLinkedListByRecursive(head);
        // if(searchElementByrecursive(head, 50)){
        // System.out.println("true");
        // }
        // else System.out.println("false");

        // LengthOfLinkedList(head);
        // System.out.println(LengthByRecursive(head));
        head = insertionBeginning(head, 5);
        // printLinkedList(head);
        insertionAtEnd(head, 15);
        // traverseLinkedList(head);
        insestAfterGiven(head, 20, 100);
        insertBeforeGiven(head, 10, 200);
        insertAtGiven(head, 3, 12);
        printLinkedList(head);
    }
}
