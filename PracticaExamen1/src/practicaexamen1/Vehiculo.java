package practicaexamen1;

public abstract class Vehiculo {

    protected String modelo, marca, tipoCombustible, transmision;
    private String placa;
    private double peso;
    private int puertas;
    private boolean rentar;

    public Vehiculo(String modelo, String nombre, String tipoCombustible, String transmision, String placa, double peso, int purtas, boolean rentar) {
        this.modelo = modelo;
        this.marca = nombre;
        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
        this.placa = placa;
        this.peso = peso;
        this.puertas = purtas;
        this.rentar = rentar;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return marca;
    }

    public void setNombre(String nombre) {
        this.marca = nombre;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPurtas() {
        return puertas;
    }

    public void setPurtas(int purtas) {
        this.puertas = purtas;
    }

    public boolean isRentar() {
        return rentar;
    }

    public void setRentar(boolean rentar) {
        this.rentar = rentar;
    }
    

}
