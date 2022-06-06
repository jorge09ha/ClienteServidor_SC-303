package Tarea1ClienteServidor;

public class Acuatico extends Vehiculo {

    //Atributos
    private int cantAspas;
    private String tipo;

    //Constructor
    public Acuatico(String marca, String modelo, String color, int cantAspas, String tipo) {
        super(marca, modelo, color);
        this.tipo = tipo;
        this.cantAspas = cantAspas;
    }

    //Metodos
    public int getCantAspas() {
        return cantAspas;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void verInfo() {
        System.out.println("Soy Acuatico");
        System.out.println("Tipo: " + this.tipo + "\nCantidad de aspas:  " + this.cantAspas + "\n" + "-".repeat(30));
    }

    public void verInfoComplete() {
        System.out.println("Soy un Vehiculo");
        System.out.println("Marca: " + getMarca() + "\nModelo:  " + getModelo() + "\nColor: " + getColor());

        System.out.println("Soy Acuatico");
        System.out.println("Tipo: " + this.tipo + "\nCantidad de aspas:  " + this.cantAspas + "\n" + "-".repeat(30));
    }
}
