package S5.excepciones;

public class Main {

    public static void main(String[] args) {
        /**
         * TRY
         * Excepciones Para evitar errores de programacion
         *
         */
//        int primerValor = 5;
//        int segundoValor = 0;
//        double total;
//        try {
//            total = primerValor / segundoValor;
//
//        } catch (Exception e) {
//            System.out.println("NO se puede dividir entre 0");
//        } finally {
//            System.out.println("Esto siempre se muestra");
//        }
        /**
         * Ejemplo 1
         * 
         */
        try {
            // "Test" is not a number
            int n = Integer.parseInt ("8") ;
            System.out.println(n);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }finally{
            System.out.println("Bien");
        }

    }

}
