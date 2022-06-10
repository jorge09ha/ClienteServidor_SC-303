package Semana4;

public class Persona {

    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public void haceAlgo(Persona e) {
//        if (e instanceof Empleado) {
//            System.out.println("Soy un empleado");
//        } else if (e instanceof Cliente) {
//            System.out.println("Soy un cliente");
//        }
//    }

}
