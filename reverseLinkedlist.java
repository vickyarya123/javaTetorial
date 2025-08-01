

public class reverseLinkedlist {

Node head;

    class Node{
        Node next;
        int data;
            Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public void printList(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void reverseList(){
        if(head==null || head.next==null){
            
            return;
        }
       Node privNode=head;
       Node currNode=head.next;
       while(currNode != null){
       Node nextNode=currNode.next;
       currNode.next=privNode;

       // updating......
       privNode=currNode;
       currNode=nextNode;
    }
       head.next=null;
       head=privNode;
    }
    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=null;
        Node currNode=head;
        while(currNode != null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
           // updating 
           prevNode=currNode;
           currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String[] args) {
        
    }
}
