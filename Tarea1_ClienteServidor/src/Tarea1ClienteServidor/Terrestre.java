package Tarea1ClienteServidor;

public class Terrestre extends Vehiculo {

    //Atributos
    private int cantLlantas;
    private String tipo, combustible;

    //Constructor
    public Terrestre(String marca, int anioFabricacion, String color, String tipo, int cantLlantas, String combustible) {
        super(marca, anioFabricacion, color);
        this.tipo = tipo;
        this.cantLlantas = cantLlantas;
        this.combustible = combustible;
    }

    //Metodos
    public String getTipo() {
        return tipo;
    }

    public int getCantLlantas() {
        return cantLlantas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void verInfo() {
        System.out.println("Soy Terrestre");
        System.out.println("Tipo: " + this.tipo + "\nCantidad de llantas:  " + this.cantLlantas + "\nCambustible: "
                + this.combustible + "\n" + "-".repeat(30));
    }

    public void verInfoComplete() {
        System.out.println("Soy un Vehiculo");
        System.out.println("Marca: " + getMarca() + "\nAño de Fabricacion:  " + getAnioFabricacion() + "\nColor :" + getColor());
        System.out.println("Soy Terrestre");
        System.out.println("Tipo: " + this.tipo + "\nCantidad de llantas:  " + this.cantLlantas + "\nCambustible: "
                + this.combustible + "\n" + "-".repeat(30));
    }
}
