package tarea2clienteservidor;

public class Motocicleta extends Terrestre {

    //Atributos
    private String tipoMoto;

    //Constructor
    public Motocicleta(String marca, String modelo, String color, int cantLlantas, String motor, String tipoMoto) {
        super(marca, modelo, color, cantLlantas, motor);
        this.tipoMoto = tipoMoto;
    }

    //Metodos
    public String getTipoMoto() {
        return tipoMoto;
    }

    @Override
    public void verInfo() {
        System.out.println("Soy una Motocicleta");
        System.out.println("Tipo de moto: " + this.tipoMoto + "\n" + "-".repeat(30));
    }

    @Override
    public void verInfoComplete() {

        System.out.println("Soy una Motocicleta");
        System.out.println("Marca: " + getMarca() + "\nModelo:  " + getModelo() + "\nColor: " + getColor());
        System.out.println("Cantidad de llantas:  " + getCantLlantas() + "\nMotor: " + getMotor());
        System.out.println("Tipo de moto: " + this.tipoMoto + "\n" + "-".repeat(30));
    }
}
