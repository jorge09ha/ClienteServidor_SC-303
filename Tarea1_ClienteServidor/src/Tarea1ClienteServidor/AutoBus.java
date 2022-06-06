package Tarea1ClienteServidor;

public class AutoBus {

    //Atributos
    private String modelo, motor, placa;
    private int cantPasajeros, cantPuertas;

    //Constructor
    public AutoBus(String modelo, String placa, String motor, int cantPasajeros, int cantPuertas) {
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

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public void verInfo() {
        System.out.println("Soy un Auto Bus");
        System.out.println("Modelo: " + modelo + "\nPlaca:  " + placa + "\nMotor :" + motor
                + "\nCantidad de pasajeros :" + cantPasajeros + "\nCantidad de puertas :" + cantPuertas);
    }

}
