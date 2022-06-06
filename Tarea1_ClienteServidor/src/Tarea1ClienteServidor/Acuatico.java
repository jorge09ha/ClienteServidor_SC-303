package Tarea1ClienteServidor;

public class Acuatico {

    //Atributos
    private int cantAspas;
    private String tipo, combustible;

    //Constructor
    public Acuatico(int cantAspas, String tipo, String combustible) {
        this.cantAspas = cantAspas;
        this.tipo = tipo;
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

    public void verInfo() {
        System.out.println("Soy Acuatico");
        System.out.println("Tipo: " + tipo + "\nCantidad de aspas:  " + cantAspas + "\nCambustible :" + combustible);
    }
}
