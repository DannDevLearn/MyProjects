package MyLinkedList;

public class LinkedListMain {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.append(9);
        list.append(7);
        list.append(6);
        list.append(2);
        list.append(4);
        list.printList();
        list.remove(6);
        list.printList();
    }
}
