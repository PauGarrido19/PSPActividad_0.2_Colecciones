import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Ejercicio8 {
    static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        Deque<Integer> pila = new ArrayDeque<>();

        for (int n : numeros) {
            pila.push(n);
        }

        List<Integer> invertida = new ArrayList<>();
        while (!pila.isEmpty()) {
            invertida.add(pila.pop());
        }

        System.out.println(invertida);
    }
}
