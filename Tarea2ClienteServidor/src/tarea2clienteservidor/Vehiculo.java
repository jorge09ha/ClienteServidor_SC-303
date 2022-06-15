package tarea2clienteservidor;

public class Vehiculo {

//Atributos
    private String marca, modelo;

    //Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Metodos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public static void queSoy(Vehiculo e) {
        if (e instanceof Terrestre) {
            System.out.println(" Soy un vehiculo TERRESTRE" + "\n");
        } else if (e instanceof Acuatico) {
            System.out.println(" Soy un vehiculo ACUATICO" + "\n");
        }
    }

}
