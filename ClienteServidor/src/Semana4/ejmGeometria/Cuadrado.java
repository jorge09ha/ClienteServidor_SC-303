package Semana4.ejmGeometria;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

}
