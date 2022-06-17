package S4.astraccion;

public class Persona implements OperacionesPersonales { //Esta clase persona implementa las interfaces

    private String nombre;
    private int edad;

    public Persona(int edad, String nombre) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String insertarEmpleado(int id, String Nombre) {
        return "Empleado Insertado";
    }

    @Override
    public String borrarEmpleado(int id) {
        return "Empleado Insertado";
    }

//    public void haceAlgo(Persona e) {
//        if (e instanceof Empleado) {
//            System.out.println("Soy un empleado");
//        } else if (e instanceof Cliente) {
//            System.out.println("Soy un cliente");
//        }
//    }
}
