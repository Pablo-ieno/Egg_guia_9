/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();

    /* Método crearPersona que pida al usuario Nombre y fecha de nacimiento 
       de la persona a crear. Retornar el objeto Persona creado.*/
    public Persona crearPersona() {

        System.out.println("Ingrese su nombre: ");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese la fecha de nacimiento: ");
        System.out.println("día: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p1.setFechaDeNacimiento(fecha);

        return new Persona();

    }

    /*Método calcularEdad que calcule la edad del usuario utilizando el atributo
    de fecha de nacimiento y la fecha actual.*/
    public int calcularEdad() {
        Date fechaActual = new Date();

        int edad = fechaActual.getYear() - p1.getFechaDeNacimiento().getYear();
//        System.out.println("Su edad es: " + edad);
        return edad;

    }

    /*Método menorQue recibe como parámetro una Persona y una edad. 
    Retorna true si la persona es menor que la edad consultada 
    o false en caso contrario.*/

    public boolean menorQue(Persona p1) {

        Persona p2 = new Persona();
        System.out.println("Ingrese la edad de otra persona: ");
        int p2edad = leer.nextInt();
        if (calcularEdad() < p2edad) {
            System.out.println("Usted tiene " + calcularEdad());
            System.out.println("Usted es menor que la 2da persona");

        } else {
            System.out.println("Usted tiene " + calcularEdad());
            System.out.println("Usted es mayor que la segunda persona");
        }
        return true;
    }

    /*Método mostrarPersona que muestra la información de la persona deseada.*/
    public void mostrarPersona() {
//        Persona Persona = crearPersona();

        System.out.println(p1.getNombre() + " " + p1.getFechaDeNacimiento());
    }

}
