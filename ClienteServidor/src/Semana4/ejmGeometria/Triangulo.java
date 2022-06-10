package Semana4.ejmGeometria;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * base;
    }

}
