package S5.forMejorado;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * FOR Mejorado
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(23);
        list.add(12);

//* n1 es una variable 
        for (Integer n1 : list) {
            System.out.println(n1);
        }

        /**
         * Esta es otra forma El object tiende a confindir cuanso se utiliza
         * datos del mismo tipo Es mejor usar generic
         */
        ArrayList list2 = new ArrayList();
        list2.add(67);
        list2.add(23);
        list2.add(12);

        for (Object n1 : list2) {
            System.out.println(n1);
        }

    }

}
