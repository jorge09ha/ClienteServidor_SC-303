package tarea2clienteservidor;

public class Yate extends Acuatico {

    //Atributos
    private int cantPasajeros;
    private boolean tieneVela;

    //Constructor
    public Yate(String marca, String modelo, String color, int cantAspas, String tipo, int cantPasajeros, boolean tieneVela) {
        super(marca, modelo, color, cantAspas, tipo);
        this.cantPasajeros = cantPasajeros;
        this.tieneVela = tieneVela;
    }

    //Metodos
    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public boolean isTieneVela() {
        return tieneVela;
    }

    public void setTieneVela(boolean tieneVela) {
        this.tieneVela = tieneVela;
    }

    @Override
    public void verInfo() {
        System.out.println("Soy un Yate");
        System.out.println("Cantidad de pasajeros: " + this.cantPasajeros + "\nTiene Vela:  " + this.tieneVela + "\n" + "-".repeat(30));
    }

    @Override
    public void verInfoComplete() {
        
        System.out.println("Soy un Yate");
        System.out.println("Marca: " + getMarca() + "\nModelo:  " + getModelo() + "\nColor: " + getColor());
        
        System.out.println("Tipo: " + getTipo() + "\nCantidad de aspas:  " + getCantAspas());

        System.out.println("Cantidad de pasajeros: " + this.cantPasajeros + "\nTiene Vela:  " + this.tieneVela + "\n" + "-".repeat(30));
    }
}
