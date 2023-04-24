/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        
        System.out.println("Ingrese día de nacimiento: ");
        int dia=leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento. ");
        int mes=leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int anio=leer.nextInt();
        Date fecha=new Date(anio-1900, mes-1,dia);               
        
        
        return fecha;
    }
     public Date fechaActual(){
         Date fechaActual = new  Date();
         return fechaActual;
                         
     }
     
     public int diferencia(Date fecha, Date fechaActual){
         int diferencia = fechaActual.getYear()-fecha.getYear();
         
         return diferencia;         
         
     }
     
     
     
}
