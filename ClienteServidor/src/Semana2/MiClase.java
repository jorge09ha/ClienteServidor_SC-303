package Semana2;

public class MiClase {

    //Atributos globales
    private String atrubuto1;
    protected int atributo2; //publico solo anivel de paquete
    private final int atributo3 = 900;
    String atributo4; //publico por defecto
    public String atrubuto5; //puede acseder desde culquier lugar del proyecto

    //Declaracion del contructor
    public MiClase(String pAtributo1, int pAtributo2) {
        this.atrubuto1 = pAtributo1; //parametro se llama igual a atrivito para diferenciar se colocas el this
        this.atributo2 = pAtributo2;
    }

    //Declaracion de metordos o comportamientos
    public String getAtrubuto1() {
        return atrubuto1;
    }

    public void setAtrubuto1(String atrubuto1) {
        this.atrubuto1 = atrubuto1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    // metodo1():que hace el metodo
    // Funcionalidad:
    // Paramentros:
    private void metodo1() {
    }

    public String metodo2() {
        this.metodo1();
        return "Prueba";

    }
}