import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {
    static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.offer("primero");
        cola.offer("segundo");
        cola.offer("tercero");

        System.out.println(cola.poll());
        System.out.println(cola.poll());
    }
}
