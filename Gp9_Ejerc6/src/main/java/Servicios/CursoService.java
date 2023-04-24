/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class CursoService {

    Scanner leer = new Scanner(System.in);
    Curso c1 = new Curso();

    /* Método cargarAlumnos(): este método le permitirá al usuario ingresar 
los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
esta información en un arreglo e iterar con un bucle, solicitando en cada 
repetición que se ingrese el nombre de cada alumno.*/
    public String[] cargarAlumnos() {
//        int cont = 0;

        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el Nombre del alumno nro " + (i + 1));
            alumnos[i] = leer.next();

        }
        return alumnos;
    }

    /* Método crearCurso(): el método crear curso, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Curso. En este método invocamos al método cargarAlumnos() 
para asignarle valor al atributo alumnos. */
    public void crearCurso(Curso c1) {

        System.out.println("Ingrese el nombre del curso:");
        c1.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas del curso:");
        c1.setCantidadHorasPorDia(leer.nextDouble());
        System.out.println("Ingrese cantidad de días por semana");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Turno");
        c1.setTurno(leer.next());
        System.out.println("Ingrese el valor por hora de clase");
        c1.setPrecioPorHora(leer.nextDouble());

    }

    /*Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.*/
    public void calcularGanancia(Curso c1) {

        int ganancia = (int) ((c1.getCantidadDiasPorSemana() * c1.getCantidadHorasPorDia()) * c1.getPrecioPorHora());
        System.out.println("Las ganancias son: " + ganancia);
    }

}
