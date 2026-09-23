import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {
    static void main(String[] args) {
        Set<String> unicos = new HashSet<>();
        unicos.add("Ana");
        unicos.add("Luis");
        unicos.add("Ana");
        unicos.add("Marta");
        unicos.add("Pedro");

        System.out.println(unicos.size());
    }
}
