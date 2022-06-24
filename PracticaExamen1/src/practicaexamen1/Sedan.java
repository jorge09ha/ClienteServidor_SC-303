package practicaexamen1;

public abstract class Sedan extends Vehiculo implements Interface {

    public Sedan(String modelo, String nombre, String tipoCombustible, String transmision, String placa, double peso, int purtas, boolean rentar) {

        super(modelo, nombre, tipoCombustible, transmision, placa, peso, purtas, rentar);

    }

    @Override
    public String insertarVehiculo() {
        return "Vehiculo insertado";
    }

    ;

    @Override
    public String borrarVehiculo() {
        return "Vehiculo borrado";
    }

    ;
    public void DefinirClaseDeVehiculoEres() {
        System.out.println("Modelo: " + modelo + ", Marca: " + marca + ", Peso en Kg: " + getPeso() + ", Combustible: " + getTipoCombustible() + ", Trasmision: " + getTransmision() + ", Rentable: " + isRentar());
    }

}
