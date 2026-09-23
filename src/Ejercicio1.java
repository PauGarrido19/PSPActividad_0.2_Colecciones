import java.util.ArrayList;

public class Ejercicio1 {
    static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Ana");
        listaNombres.add("Luis");
        listaNombres.add("Marta");
        listaNombres.add("Pedro");
        listaNombres.add("Eva");

        listaNombres.add(2,"Nuevo");
        listaNombres.remove(0);

        for (String nombre : listaNombres){
            System.out.println(listaNombres);
        }
    }
}
