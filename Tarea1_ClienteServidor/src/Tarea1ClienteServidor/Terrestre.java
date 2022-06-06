package Tarea1ClienteServidor;

public class Terrestre {

    //Atributos
    private int cantLlantas;
    private String tipo, combustible;

    //Constructor
    public Terrestre(String tipo, int cantLlantas, String combustible) {
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
        System.out.println("Tipo: " + tipo + "\nCantidad de llantas:  " + cantLlantas + "\nCambustible :" + combustible);
    }
}
