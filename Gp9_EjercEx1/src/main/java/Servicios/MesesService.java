/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class MesesService {
    
    Meses meses = new Meses();
    Scanner leer = new Scanner(System.in);
    
  public void adivinarMes (){
      
      String mesElegido;
      System.out.println(meses.getMesSecreto());
      System.out.println("Ingrese un mes a adivinar: ");
      mesElegido=leer.nextLine();
      
      
      if (mesElegido.equalsIgnoreCase(meses.getMesSecreto())) {
          System.out.println("El mes elegido es correcto");
                    
      }else{
          System.out.println("El mes es incorrecto");
      }
  }
    
    
}
