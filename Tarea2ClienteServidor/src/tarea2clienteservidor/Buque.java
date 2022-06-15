package tarea2clienteservidor;

public class Buque extends Acuatico {

    //Atributos
    private String tipoBuque;
    private int capacidadCarga;

    //Constructor
    public Buque(String marca, String modelo, String color, int cantAspas, String tipo, String tipoBuque, int capacidadCarga) {
        super(marca, modelo, color, cantAspas, tipo);
        this.tipoBuque = tipoBuque;
        this.capacidadCarga = capacidadCarga;
    }

    //Metodos
    public String getTipoBuque() {
        return tipoBuque;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void verInfo() {
        System.out.println("Soy un Buque de Carga");
        System.out.println("Tipo: " + this.tipoBuque + "\nCapacidad de carga:  " + this.capacidadCarga);
    }

    @Override
    public void verInfoComplete() {

        System.out.println("Soy un Buque");
        System.out.println("Marca: " + getMarca() + "\nModelo:  " + getModelo() + "\nColor: " + getColor());

        System.out.println("Tipo: " + getTipo() + "\nCantidad de aspas:  " + getCantAspas());

        System.out.println("Tipo: " + this.tipoBuque + "\nCapacidad de carga:  " + this.capacidadCarga + "\n" + "-".repeat(30));

    }

}
