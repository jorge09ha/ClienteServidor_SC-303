package Semana4.ejmGeometria;

public class Main {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(22, "Rojo");
        Triangulo triangulo = new Triangulo(3, 7, "Amarillo");

        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Area del triangulo: " + cuadrado.calcularArea());
        System.out.println("Perimetro del triangulo: " + cuadrado.calcularPerimetro());

    }

}
