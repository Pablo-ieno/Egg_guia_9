/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ip.gp9_ejec6;

import Entidades.Curso;
import Servicios.CursoService;
import java.util.Arrays;

/**
 *
 * @author iptal
 */
public class Gp9_Ejec6 {

    public static void main(String[] args) {

        Curso cursoE = new Curso();
        CursoService curSer = new CursoService();
        curSer.cargarAlumnos();
        System.out.println(Arrays.toString(cursoE.getAlumnos()));
        curSer.crearCurso(cursoE);
        curSer.calcularGanancia(cursoE);

    }
}
