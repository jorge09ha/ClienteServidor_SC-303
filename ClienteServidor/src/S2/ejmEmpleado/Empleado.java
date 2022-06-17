package S2.ejmEmpleado;

public class Empleado {

    private String idEmpleado;
    private Persona datosPersona;

    Empleado(Persona datosPersona) {
        this.datosPersona = datosPersona;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Persona getDatosPersona() {
        return datosPersona;
    }

    public void setDatosPersona(Persona datosPersona) {
        this.datosPersona = datosPersona;
    }

}
