package tarea2clienteservidor;

public abstract class Terrestre extends Vehiculo {

    //Atributos
    private int cantLlantas;
    private String motor;

    //Constructor
    public Terrestre(String marca, String modelo, int cantLlantas, String motor) {
        super(marca, modelo);
        this.cantLlantas = cantLlantas;
        this.motor = motor;
    }

    //Metodos
    public int getCantLlantas() {
        return cantLlantas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public abstract void verInfo();

    public abstract void verInfoComplete();
}
