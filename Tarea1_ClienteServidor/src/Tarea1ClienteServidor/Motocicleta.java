package Tarea1ClienteServidor;

public class Motocicleta {
    
   //Atributos
    private String modelo, motor, placa;
    private int cantPasajeros;
    
    //Constructor
    public Motocicleta(String modelo, String placa, String motor, int cantPasajeros) {
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.cantPasajeros = cantPasajeros;
    }

    //Metodos
    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public void verInfo() {
        System.out.println("Soy una Motocicleta");
        System.out.println("Modelo: " + modelo + "\nPlaca:  " + placa + "\nMotor :" + motor
                + "\nCantidad de pasajeros :" + cantPasajeros);
    }

}
