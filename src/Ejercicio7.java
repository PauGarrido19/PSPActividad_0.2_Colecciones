import java.util.Map;
import java.util.TreeMap;

public class Ejercicio7 {
    static void main(String[] args) {
        Map<String, Integer> frutas = new TreeMap<>();
        frutas.put("banana", 3);
        frutas.put("manzana", 1);
        frutas.put("cereza", 2);

        for (String clave : frutas.keySet()) {
            System.out.println(clave);
        }
    }
}
