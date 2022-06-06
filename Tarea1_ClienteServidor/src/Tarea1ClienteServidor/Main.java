package Tarea1ClienteServidor;

public class Main {

    public static void main(String[] args) {

        Yate yate1 = new Yate("Sunseeker ", "MANHATTAN 68", "Blanco", 2, "Deportivo", 4, false);
        yate1.verInfoComplete();
        
        Buque buque1 = new Buque("Ocean Network Express", "HMM", "Rojo", 10, "Carguero", "Buque petrolero", 23964 );
        buque1.verInfoComplete();
        
        AutoBus autoBus1 = new AutoBus("Volvo", "F12 PLUS", "Verde", 4, "5000cc", "Publico", 57);
        autoBus1.verInfoComplete();
        
        Motocicleta motocicleta1 = new Motocicleta("KTM", "Duke", "Naranja", 2, "1200cc", "Sport");
        motocicleta1.verInfoComplete();
        
        Automovil automovil1 = new Automovil("Toyota", "Yaris", "Negro", 4, "1200cc", "Sedan");
        automovil1.verInfoComplete();
        
    }
}

/**
 * Cree una jerarquía de clases que contenga al menos 8 Clases diferentes con al
 * menos 3 niveles jerárquicos (Herencia) Debe crear atributos en todas la
 * clases, métodos igualmente. Se debe hacer uso de sobreescritura, invocar al
 * constructor de la superclase. El diseño de clases debe ser una estructura de
 * la vida real, un ejemplo aplicado desde la perspectiva de cada estudiante.
 */
