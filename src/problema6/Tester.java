package problema6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tester {

    public static void main(String args[]) {

        SistemaNotas sistema = new SistemaNotas();
        Scanner s = new Scanner(System.in);
        Menu me = new Menu();
        Alumno alum = new Alumno();

        me.opciones();
        System.out.println("¿Que opcion desea?");
        while (true) {

            int opc = s.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite el nombre del alumno:");
                    String x = s.next();
                    System.out.println("Digite el apellido del alumno:");
                    String y = s.next();
                    System.out.println("Digite el carne:");
                    int z = s.nextInt();

                    alum.setNombre(x);
                    alum.setApellido(y);
                    alum.setCarne(z);

                    me.opciones2();

                    break;
                case 2:
                    System.out.println("Digite la nota obtenida:");
                    int nota = s.nextInt();
                    System.out.println("Digite puntos totales:");
                    int puntosTotales = s.nextInt();
                    System.out.println("Digite puntos obtenidos:");
                    int puntosObtenidos = s.nextInt();

                    Examen e = new Examen(alum, nota, puntosTotales,
                            puntosObtenidos, null);
                    sistema.agregarEx(e);
                    me.opciones3();
                    break;
                case 3:
                    System.out.println("Digite el nombre del Padre ");
                    String n = s.next();
                    System.out.println("Digite el apellido del Padre");
                    String a = s.next();

                    PadreFamilia prueba = new PadreFamilia(n, a);
                    alum.setPadre(prueba);

                    System.out.println("Digite el nombre de la Madre");
                    String n2 = s.next();
                    System.out.println("Digite el apellido de la Madre");
                    String a2 = s.next();

                    MadreFamilia prueba2 = new MadreFamilia(n2, a2);
                    alum.setMadre(prueba2);

                    me.opcionNew();

                    break;
                case 4:
                    alum.mostrardatos();
                    sistema.mostrarExamenes();
                    alum.imprimirPadreFamlia();
                    me.opcionnew2();

                    break;
                case 5:

                    System.out.println("ADIOS PROFE!");
                    System.out.println(" ");
                    
                    break;

                   

            }
             

        }

    }

}
