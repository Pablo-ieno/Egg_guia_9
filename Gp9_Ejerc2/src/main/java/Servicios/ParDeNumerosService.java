/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class ParDeNumerosService {

    //Importacion de un Scanner.-
    Scanner leer = new Scanner(System.in);

    //Instanciado de objetos.-
//    ParDeNumeros nserv = new ParDeNumeros();
    /*Método para mostrar valores de los números reales 
    creados de forma aleatoria en Entidades*/
 /*Se importa la clase "ParDeNumeros" desde el package Entidades*/
    public void mostrarValores(ParDeNumeros nserv) {

        System.out.println("Valor del 1er número: " + nserv.getN1());
        System.out.println("Valor del 2do número: " + nserv.getN2());

    }

    public double devolverMayor(ParDeNumeros nserv) {
        return Math.max(nserv.getN1(), nserv.getN2());}
    
    //En cambio de crear una variable como abajo, se simplifica el código retornando
    //la fórmula directamente.-

//        double numeroMayor = Math.max(nserv.getN1(), nserv.getN2());
//        System.out.println("El mayor de los dos números es: " + numeroMayor);
    //    return numeroMayor;

        

       public void calcularPotencia(ParDeNumeros nserv) {

        double numMayor = devolverMayor(nserv);
        double numMenor = Math.min(nserv.getN1(), nserv.getN2());
        double potencia = Math.round(Math.pow(numMayor, numMenor));
        System.out.println("La potencia del numero mayor es: " + potencia);

    }
       public void calcularRaiz(ParDeNumeros nserv){
           double numMenor=Math.abs(Math.min(nserv.getN1(),nserv.getN2()));
           double raiz=Math.round(Math.sqrt(numMenor));
           System.out.println("La raiz cuadrada del número menor es: "+raiz);
           
       }
    
    
}
