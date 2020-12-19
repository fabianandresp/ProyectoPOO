package problema6;

import java.util.Scanner;

public class Alumno {

    String nombre;
    String apellido;
    PadreFamilia padre;
    MadreFamilia madre;
    int carne;
    Scanner input = new Scanner(System.in);

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }

    public Alumno(PadreFamilia padre, String nombre, String apellido, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
        this.padre = padre;
    }

    public void mostrardatos() {
        System.out.println(nombre + " " + apellido + " " + carne);
    }

    public void imprimirPadreFamlia() {

        System.out.println(padre.getNombre() + " " + padre.getApellido());
        System.out.println(madre.getNombre() + " " + madre.getApellido());

    }

    //metodos gets y sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public PadreFamilia getPadre() {
        return padre;
    }

    public void setPadre(PadreFamilia padre) {
        this.padre = padre;

    }

    public MadreFamilia getMadre() {
        return madre;
    }

    public void setMadre(MadreFamilia madre) {
        this.madre = madre;
    }

}
