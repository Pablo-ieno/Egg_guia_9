/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author iptal
 */
public class ArreglosService {

    public void inicializarA(double[] vectorA) {

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) (Math.random() * 100);

        }
    }

    public void mostrar(double[] vectorA) {
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(" " +vectorA[i]+ " ");

        }
        System.out.println(" ");

    }

    public void ordenar(double[] vectorA) {
        Arrays.sort(vectorA);
        double aux;
        for (int i = 0; i < vectorA.length / 2; i++) {
            aux = vectorA[i];
            vectorA[i] = vectorA[vectorA.length - 1 - i];
            vectorA[vectorA.length - 1 - i] = aux;

        }

    }

    public void inicializarB(double[] vectorA, double[] vectorB) {

        System.arraycopy(vectorA, 0, vectorB, 0, 10);

        Arrays.fill(vectorB, 10, 20, 0.5);

    }

}
