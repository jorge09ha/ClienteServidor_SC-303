package S2.ejmEmpleado;

public class Main {

    public static void main(String[] args) {
        
//        Persona persona1 = new Persona("CED455", "Juanito", 45);
//        
//        Empleado empleado1 = new Empleado(persona1);
//        
//        empleado1.setIdEmpleado("BLX455");
//        
//        System.out.println(empleado1.getDatosPersona().getNombre());
//        
//        empleado1.getDatosPersona().setEdad(46);
//        
//        System.out.println(empleado1.getDatosPersona().getEdad());  

        Estudiante e1 = new Estudiante(4);
        //.mostrarInfo();
        Estudiante e2 = new Estudiante();
        //e2.mostrarInfo();

        int c = 9;

        e1.b = 6;
        Estudiante.b++;

        e2.mostrarInfo();
    }

}
