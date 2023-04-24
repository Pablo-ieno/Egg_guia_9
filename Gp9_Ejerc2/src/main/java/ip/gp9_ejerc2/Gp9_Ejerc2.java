/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ip.gp9_ejerc2;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**
 *
 * @author iptal
 */
public class Gp9_Ejerc2 {

    public static void main(String[] args) {

        ParDeNumerosService nserv = new ParDeNumerosService();
        ParDeNumeros nreal = new ParDeNumeros();
        nserv.mostrarValores(nreal);
        System.out.println("El número mayor es: "+nserv.devolverMayor(nreal));
        nserv.calcularPotencia(nreal);
        nserv.calcularRaiz(nreal);
        System.out.println(nreal.toString());
        
        

    }
}
