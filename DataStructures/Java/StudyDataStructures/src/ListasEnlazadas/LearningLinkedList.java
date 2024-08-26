package ListasEnlazadas;

public class LearningLinkedList {
    public static void main(String[] args) {
        List head = new List();
        head.append(9);
        head.append(7);
        head.append(16);
        head.append(3);
        System.out.println(head.size);
        head.printList();
        System.out.println(head.findByIndex(2));
        head.remove(2);
        head.printList();
        System.out.println(head.size);

    }

    static class List{

        int size = 0;

        Node head;

        public void printList(){
            Node curNode = head;
            System.out.print("[");
            while (curNode != null) {
                System.out.printf(" %s ",curNode.value);
                curNode = curNode.next;
            }
            System.out.print("]\n");
        }

        public void append(int value){
            if (head == null) {
                head = new Node(value);
                size++;
                return;
            }
            Node curNode = head;
            while (curNode.next != null)
                curNode = curNode.next;

            curNode.next = new Node(value);
            size++;
        }

        public int findByIndex(int idx){
            if (idx >= size)
                throw new RuntimeException("Invalid parameter");
            int auxIdx = 0;
            Node curNode = head;
            while (curNode != null && auxIdx <= idx){
                if ( auxIdx == idx )
                    return curNode.value;
                curNode = curNode.next;
                auxIdx++;
            }
            throw new RuntimeException("Invalid parameter");
        }

        public void remove(int idx){
            if ( idx >= size ) throw new RuntimeException("Invalid Idx");
            Node curNode = head;
            int auxIdx = 0;
            while (curNode != null){
                if ( idx == auxIdx+1 ){
                   curNode.next = curNode.next.next;
                   size--;
                   return;
                }
                auxIdx++;
                curNode = curNode.next;
            }
        }
    }

    static class Node{
        public Node(){}
        public Node(int value) {
            this.value = value;
            next = null;
        }

        int value;
        Node next;
    }
}
