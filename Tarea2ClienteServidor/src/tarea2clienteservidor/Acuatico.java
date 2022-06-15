package tarea2clienteservidor;

public abstract class Acuatico extends Vehiculo {

    //Atributos
    private int cantAspas;
    private String tipo;

    //Constructor
    public Acuatico(String marca, String modelo, int cantAspas, String tipo) {
        super(marca, modelo);
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

    public abstract void verInfo();

    public abstract void verInfoComplete();
}
