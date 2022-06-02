package Semana2.ejmEmpleado;

public class Estudiante {

    public int a;
    static int b;

    Estudiante() {
        this.b++;
        this.a++;
    }

    Estudiante(int a) {
        this.b++;
        this.a = a;
    }

    public void mostrarInfo() {
        System.out.println("Valor de a = " + this.a);
        System.out.println("Valor de b = " + this.b);
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public int suma(int a, int b, int c) {
        return a + b + c;
    }
}
