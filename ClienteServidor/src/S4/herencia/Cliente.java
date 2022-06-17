package S4.herencia;

public class Cliente extends Persona {

    private String idCliente;

    public Cliente(String idCliente, int edad, String nombre) {
        super(edad, nombre);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

}
