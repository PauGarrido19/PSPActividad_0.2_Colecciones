import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {
    static void main(String[] args) {
        Map<String, Double> precios = new HashMap<>();
        precios.put("P1", 15.0);
        precios.put("P2", 25.0);
        precios.put("P3", 9.5);

        precios.remove("P2");

        for (String clave : precios.keySet()) {
            System.out.println(clave + " -> " + precios.get(clave));
        }
    }
}
