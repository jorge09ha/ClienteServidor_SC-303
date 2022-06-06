package Tarea1ClienteServidor;

public class Acuatico extends Vehiculo {

    //Atributos
    private int cantAspas;
    private String tipo, combustible;

    //Constructor
    public Acuatico(int cantAspas, String tipo, String combustible, String marca, int anioFabricacion, String color) {
        super(marca, anioFabricacion, color);
        this.tipo = tipo;
        this.cantAspas = cantAspas;
        this.combustible = combustible;
    }

    //Metodos
    public int getCantAspas() {
        return cantAspas;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public void verInfo() {
        System.out.println("Soy Acuatico");
        System.out.println("Tipo: " + this.tipo + "\nCantidad de aspas:  " + this.cantAspas + "\nCambustible: "
                + this.combustible + "\n" + "-".repeat(30));
    }

    public void verInfoComplete() {
        System.out.println("Soy un Vehiculo");
        System.out.println("Marca: " + getMarca() + "\nAño de Fabricacion:  " + getAnioFabricacion() + "\nColor :" + getColor());
        System.out.println("Soy Acuatico");
        System.out.println("Tipo: " + this.tipo + "\nCantidad de aspas:  " + this.cantAspas + "\nCambustible: "
                + this.combustible + "\n" + "-".repeat(30));
    }
}
