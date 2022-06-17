package S4.herencia;

public class Main {

    public static void main(String[] args) {

        Persona[] persona = new Persona[2];
        persona[0] = new Empleado("EMP123", 30, "Jorge");
        persona[1] = new Cliente("CLI123", 25, "Andres");
        
        System.out.println(persona[0]);

        Empleado empleado = new Empleado("sss", 5, "ddd");
        Cliente cliente = new Cliente("sss", 5, "ddd");
        haceAlgo(cliente);

    }

    public static void haceAlgo(Persona e) {
        if (e instanceof Empleado) {
            System.out.println("Soy un empleado");
        } else if (e instanceof Cliente) {
            System.out.println("Soy un cliente");
        }
    }

}
