package Tarea1ClienteServidor;

public class Main {

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("Nissan", 1991, "Rojo");
        vehiculo1.verInfo();
        Terrestre terrestre1 = new Terrestre("Toyota", 1991, "Blanco", "Carga", 4, "Disel");
        terrestre1.verInfoComplete();

    }
}

/**
 * Cree una jerarquía de clases que contenga al menos 8 Clases diferentes con al
 * menos 3 niveles jerárquicos (Herencia) Debe crear atributos en todas la
 * clases, métodos igualmente. Se debe hacer uso de sobreescritura, invocar al
 * constructor de la superclase. El diseño de clases debe ser una estructura de
 * la vida real, un ejemplo aplicado desde la perspectiva de cada estudiante.
 */
