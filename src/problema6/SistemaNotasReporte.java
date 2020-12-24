/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

/**
 *
 * @author pimie
 */
public class SistemaNotasReporte {

    SistemaNotas x = new SistemaNotas();
    Alumno a = new Alumno();

    public void generarReporteTodosExamenes() {
        x.mostrarExamenes();

    }

    public void generarReporteTodosAlumnos() {

        a.mostrardatos();
    }

    public void generarReporteAlumnosConNotaInferiorA(int nota) {
        x.mostrarExamenMenoresA(nota);

    }

    public void generarReporteTodosExamenesOrdenadosPor() {
        x.ordenar();
    }

}
