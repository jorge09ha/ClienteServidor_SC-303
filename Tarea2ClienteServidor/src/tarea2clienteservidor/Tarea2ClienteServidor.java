package tarea2clienteservidor;

public class Tarea2ClienteServidor {

    public static void main(String[] args) {

        Yate yate1 = new Yate("Sunseeker ", "MANHATTAN 68", "Blanco", 2, "Deportivo", 4, false);
        yate1.queSoy(yate1); //queSoy es una instancia de la la clase vehiculo

        Automovil automovil1 = new Automovil("Toyota", "Yaris", "Negro", 4, "1200cc", "Sedan");
        automovil1.queSoy(automovil1); 

    }
}
/**
 * Tome la jerarquía de clases de la practica de semana 2 y cree al menos dos
 * clases abstractas con métodos abstractos, utilice al menos una interface.
 */
