package Tarea1ClienteServidor;

public class Vehiculo {

//Atributos
    private String marca, color;
    private int anioFabricacion;

    //Constructor
    public Vehiculo(String marca, int anioFabricacion, String color) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.color = color;
    }

    //Metodos
    public String getMarca() {
        return marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void verInfo() {
        System.out.println("Soy un Vehiculo");
        System.out.println("Marca: " + this.marca + "\nAño de Fabricacion:  " + this.anioFabricacion + "\nColor :"
                + this.color + "\n" + "-".repeat(30));
    }
}
