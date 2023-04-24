/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ip.gp9_ejerc4;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author iptal
 */
public class Gp9_Ejerc4 {

    public static void main(String[] args) {
        
              
        FechaService fs=new FechaService();
        Date d1= fs.fechaNacimiento();
        Date d2= fs.fechaActual();
        System.out.println("Su edad es: "+(fs.diferencia(d1, d2)));     
        
                
    }
}
