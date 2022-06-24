
package S6.archivos;

import javax.swing.JOptionPane;


public class Menu {

    private Operacion op = new Operacion();

    public void mostrarMenu() {
        byte opc = Byte.parseByte(JOptionPane.showInputDialog(null,
                "***Menu Principal***\n\n"
                + "1.Agregar\n"
                + "2.Modificar\n"
                + "3.Eliminar\n"
                + "4.Consultar\n"
                + "5.Exit Program"
                + "Digite su opcion:"));
        switch (opc) {
            case 1: {
                op.agregar();
                mostrarMenu();
                break;
            }
            case 2: {
                op.editar();
                mostrarMenu();
                break;
            }
            case 3: {
                op.eliminar();
                mostrarMenu();
                break;
            }
            case 4: {
                op.buscar();
                mostrarMenu();
                break;
            }
            case 5: {
                System.exit(0);
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Opcion incorrecta, favor "
                        + "revisar!");
                mostrarMenu();
            }
        }
    }
}
