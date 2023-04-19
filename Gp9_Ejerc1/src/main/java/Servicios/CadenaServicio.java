/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    //Metodos
    public Cadena crearFrase() {

        System.out.println("Ingrese una frase: ");
        String frase = (leer.nextLine());

        return new Cadena(frase);

    }

    //Metodo MostrarVocales
    public void mostrarVocales(Cadena fr1) {
        int cont = 0;

        for (int i = 0; i < fr1.getLongFrase(); i++) {
            String letra = fr1.getFrase().substring(i, i + 1);

            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                cont++;
            }

        }
        System.out.println("La frase tiene: " + cont + " vocales");
    }

    //Metodo InvertiFrase
    public void invertirFrase(Cadena fr1) {

        for (int i = fr1.getLongFrase(); i > 0; i--) {
            String letra = fr1.getFrase().substring(i - 1, i);
            System.out.print(letra);

        }
        System.out.println("");

    }

    //Metodo vecesRepetido
    public void vecesRepetido(Cadena fr1) {

        System.out.println("Ingrese un caracter para ver cuantas veces se repite: ");
        String caracter = leer.nextLine();

        int cont = 0;

        for (int i = 0; i < fr1.getLongFrase(); i++) {
            String letra = fr1.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase(caracter)) {
                cont++;

            }

        }
        System.out.println("El caracter: " + caracter + " se repite: " + cont + " veces.");

    }
    //Metodo comparar Longitud.-

    public void compararLongitud(Cadena fr1) {

        System.out.println("Ingrese una frase para comparar longitudes");
        String fr2 = leer.nextLine();
        if (fr1.getLongFrase() == fr2.length()) {
            System.out.println("Las frases tienen la misma cantidad de caracteres");

        } else {
            System.out.println("La longitud de la frase 1 es de: " + fr1.getLongFrase());
            System.out.println("La longitud de la frase 2 es de: " + fr2.length());
        }
    }
    //Metodo Unir Frases.-

    public void unirFrases(Cadena fr1) {

        System.out.println("Ingrese una frase para unir");
        String fr2 = leer.nextLine();
        System.out.println(fr1.getFrase() + " " + fr2);

    }

    //Metodo reemplazar letra.-
    public void reemplazarLetra(Cadena fr1) {
        System.out.println("Ingrese un simbolo para reemplazar la letra a:");
        String simbolo = leer.nextLine();

        for (int i = 0; i < fr1.getLongFrase(); i++) {
            String letra = fr1.getFrase().substring(i, i + 1);

            if (letra.equalsIgnoreCase(simbolo)) {
                letra = "a";

            } else {
                letra = letra;
            }

            System.out.print(letra);
        }
        System.out.println("");

    }
    
    //Metodo contiene letra.-
    
    public void contieneLetra(Cadena fr1){
        
        System.out.println("Ingrese una letra para comprobar si la contiene la frase:");
        String simbolo = leer.nextLine();
        int cont=0;

        for (int i = 0; i < fr1.getLongFrase(); i++) {
            String letra = fr1.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase(simbolo)) {
                cont++;
            }
                
            }
        if (cont>0) {
            System.out.println("Verdadero, la letra: "+simbolo+" está en la frase");
            
        }else{
            System.out.println("Falso, la letra: "+simbolo+" no está en la frase");
        }

    }
    

}
