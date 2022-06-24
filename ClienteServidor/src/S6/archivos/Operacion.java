package S6.archivos;

import javax.swing.JOptionPane;
import java.io.*;

public class Operacion {

    private static String cedula, nombre, direccion, telefono, email, provincia;
    private static int edad;

    public Operacion() {
    }

    public static boolean camposVacios() {
        if ((cedula.equals(""))
                || (nombre.equals(""))
                || (direccion.equals(""))
                || (telefono.equals(""))
                || (email.equals(""))
                || (provincia.equals(""))) {

            return true;
        } else {
            return false;
        }
    }

    public static void agregar() {
        try {
            DataOutputStream archivo = new DataOutputStream(
                    new FileOutputStream("clientes.dat", true));
            cedula = JOptionPane.showInputDialog(null, "Digite la cedula");
            nombre = JOptionPane.showInputDialog(null, "Digite el nombre");
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite la edad"));
            direccion = JOptionPane.showInputDialog(null, "Digite la direccion");
            telefono = JOptionPane.showInputDialog(null, "Digite el telefono");
            email = JOptionPane.showInputDialog(null, "Digite el email");
            provincia = JOptionPane.showInputDialog(null, "Digite la provincia");

            archivo.writeUTF(cedula);
            archivo.writeUTF(nombre);
            archivo.writeInt(edad);
            archivo.writeUTF(direccion);
            archivo.writeUTF(telefono);
            archivo.writeUTF(email);
            archivo.writeUTF(provincia);
            JOptionPane.showMessageDialog(null, "Datos agregados correctamente!",
                    "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
            archivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public void buscar() {
        String ced, nom, dir, tel, ema, prov;
        int ed;

        String nomb = JOptionPane.showInputDialog(null, "Digite el nombre a "
                + "buscar:");

        try {
            DataInputStream archivo = new DataInputStream(
                    new FileInputStream("clientes.dat"));
            try {
                while (true) {
                    ced = archivo.readUTF();
                    nom = archivo.readUTF();
                    ed = archivo.readInt();
                    dir = archivo.readUTF();
                    tel = archivo.readUTF();
                    ema = archivo.readUTF();
                    prov = archivo.readUTF();

                    if (nomb.equals(nom)) {
                        JOptionPane.showMessageDialog(null,
                                "La persona " + nom + " cuya cedula es " + ced
                                + " que vive en " + prov + " " + dir + " tiene "
                                + ed + " anos. Su telefono es " + tel + " y su email es "
                                + ema);
                    } else {
                    }
                }
            } catch (EOFException ex) {
                archivo.close();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "El archivo no existe", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error Desconocido", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editar() {
        String ced, nom, dir, tel, ema, prov;
        int ed;

        String cedb = JOptionPane.showInputDialog(null, "Digite la cedula a "
                + "buscar:");

        try {
            DataInputStream archivo1 = new DataInputStream(
                    new FileInputStream("clientes.dat"));
            DataOutputStream archivo2 = new DataOutputStream(
                    new FileOutputStream("auxiliar.dat"));
            try {
                while (true) {
                    ced = archivo1.readUTF();
                    nom = archivo1.readUTF();
                    ed = archivo1.readInt();
                    dir = archivo1.readUTF();
                    tel = archivo1.readUTF();
                    ema = archivo1.readUTF();
                    prov = archivo1.readUTF();

                    if (cedb.equals(ced)) {
                        ced = JOptionPane.showInputDialog(null, "Digite la cedula");
                        nom = JOptionPane.showInputDialog(null, "Digite el nombre");
                        ed = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Digite la cedula"));
                        dir = JOptionPane.showInputDialog(null, "Digite la direccion");
                        tel = JOptionPane.showInputDialog(null, "Digite el telefono");
                        ema = JOptionPane.showInputDialog(null, "Digite el email");
                        prov = JOptionPane.showInputDialog(null, "Digite la provincia");
                    }
                    archivo2.writeUTF(ced);
                    archivo2.writeUTF(nom);
                    archivo2.writeInt(ed);
                    archivo2.writeUTF(dir);
                    archivo2.writeUTF(tel);
                    archivo2.writeUTF(ema);
                    archivo2.writeUTF(prov);
                }
            } catch (EOFException ex) {
                archivo1.close();
                archivo2.close();
                intercambiar();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "El archivo no existe", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error Desconocido", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public void intercambiar() {
        String ced, nom, dir, tel, ema, prov;
        int ed;
        try {
            DataInputStream archivo1 = new DataInputStream(
                    new FileInputStream("auxiliar.dat"));
            DataOutputStream archivo2 = new DataOutputStream(
                    new FileOutputStream("clientes.dat"));
            try {
                while (true) {
                    ced = archivo1.readUTF();
                    nom = archivo1.readUTF();
                    ed = archivo1.readInt();
                    dir = archivo1.readUTF();
                    tel = archivo1.readUTF();
                    ema = archivo1.readUTF();
                    prov = archivo1.readUTF();
                    archivo2.writeUTF(ced);
                    archivo2.writeUTF(nom);
                    archivo2.writeInt(ed);
                    archivo2.writeUTF(dir);
                    archivo2.writeUTF(tel);
                    archivo2.writeUTF(ema);
                    archivo2.writeUTF(prov);
                }
            } catch (EOFException ex) {
                archivo1.close();
                archivo2.close();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "El archivo no existe", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error Desconocido", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminar() {
        String ced, nom, dir, tel, ema, prov;
        int ed;
        String cedb = JOptionPane.showInputDialog(null, "Digite la cedula a "
                + "eliminar:");
        try {
            DataInputStream archivo1 = new DataInputStream(
                    new FileInputStream("clientes.dat"));
            DataOutputStream archivo2 = new DataOutputStream(
                    new FileOutputStream("auxiliar.dat"));
            try {
                while (true) {
                    ced = archivo1.readUTF();
                    nom = archivo1.readUTF();
                    ed = archivo1.readInt();
                    dir = archivo1.readUTF();
                    tel = archivo1.readUTF();
                    ema = archivo1.readUTF();
                    prov = archivo1.readUTF();
                    if (!cedb.equals(ced)) {
                        archivo2.writeUTF(ced);
                        archivo2.writeUTF(nom);
                        archivo2.writeInt(ed);
                        archivo2.writeUTF(dir);
                        archivo2.writeUTF(tel);
                        archivo2.writeUTF(ema);
                        archivo2.writeUTF(prov);
                    }
                }
            } catch (EOFException ex) {
                archivo1.close();
                archivo2.close();
                intercambiar();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "El archivo no existe", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error Desconocido", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
