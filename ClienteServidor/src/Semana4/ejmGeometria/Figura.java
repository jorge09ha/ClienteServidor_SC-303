package Semana4.ejmGeometria;

//Solo es pone astracto a figura
public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
   //No es nesesario que tenga cuerpo
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

}
