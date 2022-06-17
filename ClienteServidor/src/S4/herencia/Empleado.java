package S4.herencia;

public class Empleado extends Persona {

    private String idEmpleado;

    public Empleado(String idEmpleado, int edad, String nombre) {
        super(edad, nombre);
        this.idEmpleado = idEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

}
