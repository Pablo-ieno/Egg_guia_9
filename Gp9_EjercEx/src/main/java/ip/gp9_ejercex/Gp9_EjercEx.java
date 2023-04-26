/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ip.gp9_ejercex;

import Servicios.AhorcadoService;

/**
 *
 * @author iptal
 */
public class Gp9_EjercEx {

    /**
     * Método juego(): el método juego se encargará de llamar todos los métodos previamente
     * mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos.
     * Este método se llamará en el main.
     *
     * @param args
     */
    public static void main(String[] args) {
        AhorcadoService aS = new AhorcadoService();
        aS.juego();
}
}

