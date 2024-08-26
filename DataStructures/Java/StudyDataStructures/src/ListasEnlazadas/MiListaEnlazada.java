package ListasEnlazadas;

/**
 * Lo siguiente no es necesario implementarlo ya que cada lenguaje de programacion
 * nos puede proveer una manera de manejar estas estructuras de datos
 * */
public class MiListaEnlazada {
    public static void main(String[] args) {
        // Ya que tenemos nuestra clase Nodo vamos a ver el funcionamiento
        // Primero vamos a crear lo que es nuestro head

        Node head = new Node("Head");
        // Ya creado vamos a enlazarle un nuevo objeto, pero recuerda que debemos crear primero
        // el objeto que vamos a enlazar
        // De esta manera es muy basico pero solo veremos el funcionamiento
        Node obj1 = new Node("Silvestre");
        head.next = obj1;
        // Lo mismo con dos objetos mas
        Node obj2 = new Node("Lucas");
        Node obj3 = new Node("Taz");
        obj1.next = obj2;
        obj2.next = obj3;

        // Como podemos ver basicamente tenemos lo siguiente
        // Head -> Silvestre -> Lucas -> Taz -> null
        // Ahora solo imprimimos

        Node currentValue = head;
        while (currentValue != null){
            System.out.printf("%s -> ", currentValue.getValue());
            currentValue = currentValue.getNext();
        }
        System.out.print("null");
    }

    static class Node{
        Node next;
        String value;

        public Node(String value) {
            this.value = value;
            this.next = null;
        }

        public String getValue() {
            return value;
        }
        public Node getNext(){
            return this.next;
        }

    }
}
