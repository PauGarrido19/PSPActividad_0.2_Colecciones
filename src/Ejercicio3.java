import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio3 {
    static void main(String[] args) {
        Deque<String> pila = new ArrayDeque<>();

        pila.push("primero");
        pila.push("segundo");
        pila.push("tercero");

        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }
}
