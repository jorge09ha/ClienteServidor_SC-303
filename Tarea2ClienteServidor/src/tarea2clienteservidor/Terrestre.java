package tarea2clienteservidor;

public class Terrestre extends Vehiculo {

    //Atributos
    private int cantLlantas;
    private String motor;

    //Constructor
    public Terrestre(String marca, String modelo, String color, int cantLlantas, String motor) {
        super(marca, modelo, color);
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

    @Override
    public void verInfo() {
        System.out.println("Soy Terrestre");
        System.out.println("Cantidad de llantas:  " + this.cantLlantas + "\nMotor: " + this.motor + "\n" + "-".repeat(30));
    }

    public void verInfoComplete() {
        System.out.println("Soy un Vehiculo");
        System.out.println("Marca: " + getMarca() + "\nModelo:  " + getModelo() + "\nColor: " + getColor());

        System.out.println("Soy Terrestre");
        System.out.println("Cantidad de llantas:  " + this.cantLlantas + "\nMotor: " + this.motor + "\n" + "-".repeat(30));
    }
}
