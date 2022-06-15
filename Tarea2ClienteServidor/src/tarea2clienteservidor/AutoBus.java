package tarea2clienteservidor;

public class AutoBus extends Terrestre {

    //Atributos
    private String tipoTrasporte;
    private int cantPasajeros;

    //Constructor
    public AutoBus(String marca, String modelo, String color, int cantLlantas, String motor, String tipoTrasporte, int cantPasajeros) {
        super(marca, modelo, color, cantLlantas, motor);
        this.tipoTrasporte = tipoTrasporte;
        this.cantPasajeros = cantPasajeros;
    }

    public String getTipoTrasporte() {
        return tipoTrasporte;
    }

    public void setTipoTrasporte(String tipoTrasporte) {
        this.tipoTrasporte = tipoTrasporte;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    //Metodos
    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public void verInfo() {
        System.out.println("Soy un Auto Bus");
        System.out.println("Tipo Trasporte: " + this.tipoTrasporte + "\nCantidad de pasajeros :" + cantPasajeros + "\n" + "-".repeat(30));
    }

    public void verInfoComplete() {

        System.out.println("Soy un Auto Bus");
        System.out.println("Marca: " + getMarca() + "\nModelo:  " + getModelo() + "\nColor: " + getColor());

        System.out.println("Cantidad de llantas:  " + getCantLlantas() + "\nMotor: " + getMotor());

        System.out.println("Tipo Trasporte: " + this.tipoTrasporte + "\nCantidad de pasajeros: " + cantPasajeros + "\n" + "-".repeat(30));
    }

}
