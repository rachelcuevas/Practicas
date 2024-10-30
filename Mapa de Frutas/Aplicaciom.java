import  java.util.HashMap;
import java.util.Set;

public class Aplicaciom {

    public static void main(String[] args) {
        HashMap<String, Integer> frutas = new HashMap<String, Integer>(); 

        frutas.put("Manzana", 5);
        frutas.put("Platano", 2);
        frutas.put("Naranja", 3);
        frutas.put("Uvas", 5);
        frutas.put("Pera", 1);

        int frutaDos = (frutas.get("Platano"));
        System.out.println(frutaDos);

        Set<String> claves = frutas.keySet();
        for (String clave: claves){
            System.out.println(clave + " " + frutas.get(clave));
        }


    }
}