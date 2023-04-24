/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ip.gp9_ejerc5;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author iptal
 */
public class Gp9_Ejerc5 {

    public static void main(String[] args) {

        PersonaService pers = new PersonaService();
        Persona perEnt = pers.crearPersona();
        pers.calcularEdad();
        pers.menorQue(perEnt);
        pers.mostrarPersona();

    }
}
