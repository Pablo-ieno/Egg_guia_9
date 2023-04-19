/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ip.gp9_ejerc1;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp9_Ejerc1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        CadenaServicio cadSer = new CadenaServicio();
        Cadena frase = cadSer.crearFrase();
        int opc = 0;
        do {
            System.out.println("Opción 1 Mostrar Vocales");
            System.out.println("Opcion 2 Invertir Frase");
            System.out.println("Opcion 3 Veces Repetido");
            System.out.println("Opcion 4 Compara Longitud");
            System.out.println("Opcion 5 Unir Fraces");
            System.out.println("Opcion 6 Reemplazar Letra");
            System.out.println("Opcion 7 Contiene Letra");
            System.out.println("Opcion 8 Salir");

            System.out.println("Ingrese la Opcion deseada:");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    cadSer.mostrarVocales(frase);

                    break;
                case 2:
                    cadSer.invertirFrase(frase);
                    break;
                case 3:
                    cadSer.vecesRepetido(frase);
                    break;
                case 4:
                    cadSer.compararLongitud(frase);
                    break;
                case 5:
                    cadSer.unirFrases(frase);
                    break;
                case 6:
                    cadSer.reemplazarLetra(frase);
                    break;
                case 7:
                    cadSer.contieneLetra(frase);
                    break;
                case 8:

                    break;
                default:
                    throw new AssertionError();
            }

        } while (opc != 8);

    }
}
