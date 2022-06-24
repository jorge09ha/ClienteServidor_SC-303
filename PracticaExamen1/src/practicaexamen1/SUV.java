package practicaexamen1;

public class SUV extends Vehiculo {

    protected String velocidadesTransmision;
    protected int alturaMaximaVehiculo, cantidadDePasajeros;
    protected boolean offRoad;

    public SUV(String velocidadesTransmision, int alturaMaximaVehiculo, int cantidadDePasajeros, boolean offRoad, String modelo, String nombre, String tipoCombustible, String transmision, String placa, double peso, int purtas, boolean rentar) {
        super(modelo, nombre, tipoCombustible, transmision, placa, peso, purtas, rentar);
        this.velocidadesTransmision = velocidadesTransmision;
        this.alturaMaximaVehiculo = alturaMaximaVehiculo;
        this.cantidadDePasajeros = cantidadDePasajeros;
        this.offRoad = offRoad;
    }

    public String getVelocidadesTransmision() {
        return velocidadesTransmision;
    }

    public void setVelocidadesTransmision(String velocidadesTransmision) {
        this.velocidadesTransmision = velocidadesTransmision;
    }

    public int getAlturaMaximaVehiculo() {
        return alturaMaximaVehiculo;
    }

    public void setAlturaMaximaVehiculo(int alturaMaximaVehiculo) {
        this.alturaMaximaVehiculo = alturaMaximaVehiculo;
    }

    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    public boolean isOffRoad() {
        return offRoad;
    }

    public void setOffRoad(boolean offRoad) {
        this.offRoad = offRoad;
    }
    
    

    public void DefinirClaseDeVehiculoEres() {
        System.out.println("Modelo: " + modelo + ", Marca: " + marca + ", Peso en Kg: " + getPeso() + ", Combustible: " + getTipoCombustible() + ", Trasmision: " + getTransmision() + ", Rentable: " + isRentar());
    }

}
