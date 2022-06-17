package S5.colecciones;

import java.util.HashSet;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //**COLECCIONES**

        /**
         * Hash SET Colección desordenada de objetos Los duplicados no son
         * permitidos
         */
        
//        Set hash_set = new HashSet();
//        Persona myPersona = new Persona("Jorge", "Hernandez");
//        hash_set.add("Hola"); //agrega al arreglo
//        hash_set.add("world");
//        hash_set.add("Hola"); //no agrega este ya que esta repetido
//        hash_set.add(4);
//        hash_set.add(4.0); //si agrega esto xq es con decimal
//        hash_set.add(myPersona.getNombre());
//        System.out.println("existe el 4:" + hash_set.contains(4)); //consulta si existe el 4
//        System.out.println(hash_set);

        /**
         * Coleccion generica javaGeneric
         */
        
//        Set<String> hash_set = new HashSet<>(); //Permite encapsular lo que entra en la coleccion
//        hash_set.add("hola");
//        System.out.println(hash_set);

        /**
         * LIST Contenedor de elementos ordenados Los duplicados son permitidos
         */
        
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(0, 45); //agrego (indice,datoQueSeAgrega)
//        list.add(67);
//        list.add(2, 89);
//        list.indexOf(89); //encuntrea la pocicion 
//        System.out.println(list.get(0)); //para imprimir tengo que definir la pocicion contrario al SET ()
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        list.set(2, 90); //Remplazo el valor de la pocicion 2
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2)); 

        /**
         * MAP
         * Colección de pares clave/valor
         * La clave es utilizada para indexar el elemento
         * Los duplicados no son permitidos
         * Es un diccionario
         */
        
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }
}
