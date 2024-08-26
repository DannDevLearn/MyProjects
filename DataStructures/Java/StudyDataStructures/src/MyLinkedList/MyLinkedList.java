package MyLinkedList;

public class MyLinkedList {

    Node head;

    public void append(int value){
        if(head == null){
            head = new Node(value);
            return;
        }
        Node current = head;
        while(current.next != null)
            current = current.next;

        current.next = new Node(value);
    }

    public void printList(){
        Node current = head;
        while (current.next != null){
            System.out.print(current.value +"->");
            current = current.next;
        }
        System.out.println(" ");
    }

    public void remove(int value){
        if( head == null) return;

        if( head.value == value ) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null){
            if( current.next.value == value ){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}

class Node{

    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
}
