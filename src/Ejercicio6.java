import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio6 {
    static void main(String[] args) {
        List<String> palabras = List.of("sol", "luna", "estrella", "cometa");
        Map<String, Integer> longitudes = new HashMap<>();

        for (String palabra : palabras) {
            longitudes.put(palabra, palabra.length());
        }

        System.out.println(longitudes);
    }
}
