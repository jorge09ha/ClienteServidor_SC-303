package Tarea1ClienteServidor;

public class Automovil extends Terrestre {

    //Atributos
    private String tipoAuto;

    //Constructor
    public Automovil(String marca, String modelo, String color, int cantLlantas, String motor, String tipoAuto) {
        super(marca, modelo, color, cantLlantas, motor);
        this.tipoAuto = tipoAuto;
    }

    //Metodos
    public String getTipoAuto() {
        return tipoAuto;
    }

    @Override
    public void verInfo() {
        System.out.println("Soy un Automovil");
        System.out.println("Tipo de Auto: " + this.tipoAuto + "\n" + "-".repeat(30));
    }

    @Override
    public void verInfoComplete() {

        System.out.println("Soy un Automovil");
        System.out.println("Marca: " + getMarca() + "\nModelo:  " + getModelo() + "\nColor: " + getColor());
        System.out.println("Cantidad de llantas:  " + getCantLlantas() + "\nMotor: " + getMotor());
        System.out.println("Tipo de Auto: " + this.tipoAuto + "\n" + "-".repeat(30));
    }

}
