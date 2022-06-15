package tarea2clienteservidor;

public class Vehiculo {

//Atributos
    private String marca, modelo, color;

    //Constructor
    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //Metodos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void verInfo() {
        System.out.println("Soy un Vehiculo");
        System.out.println("Marca: " + this.marca + "\nModelo:  " + this.modelo + "\nColor: "
                + this.color + "\n" + "-".repeat(30));
    }

    public void queSoy(Vehiculo e) { //Instancia
        if (e instanceof Acuatico) {
            System.out.println("Son un vehiculo acuatico");
        } else if (e instanceof Terrestre) {
            System.out.println("Son un vehiculo terretre");
        }

    }
}
