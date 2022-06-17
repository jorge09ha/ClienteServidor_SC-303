package S5.comparable;

public class Main {

    public static void main(String[] args) {

        /**
         * Permite hacer comparaciones entre objetos del mismo tipo
         */
        Persona persona1 = new Persona("Pedro", 34);
        Persona persona2 = new Persona("Juan", 34);

        if (persona1.compareTo(persona2) < 0) {
            System.out.println("Persona1 es mayor a Persona2");
        } else if (persona1.compareTo(persona2) > 0) {
            System.out.println("Persona2 es mayor a Persona1");
        } else {
            System.out.println("Persona1 es igual a Persona2");
        }

    }

}
