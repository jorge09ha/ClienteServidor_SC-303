package tarea2clienteservidor;

public class Main {

    public static void main(String[] args) {

        Yate yate1 = new Yate("Sunseeker ", "MANHATTAN 68", 2, "Deportivo", 4, false);
        yate1.queSoy(yate1);//queSoy es una interface de la clase vehiculo
        yate1.verInfoComplete(); //Acuatico es una clase abstracta
        

        Automovil automovil1 = new Automovil("Toyota", "Yaris", 4, "1200cc", "Sedan");
        automovil1.queSoy(automovil1);
        automovil1.verInfo();//Terrstre es una clase abstracta
        
        

    }
}
/**
 * Tome la jerarquía de clases de la practica de semana 2 y cree al menos dos
 * clases abstractas con métodos abstractos, utilice al menos una interface.
 */
