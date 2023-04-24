/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author iptal
 */
public class ParDeNumeros {
    
    
    //Atributos, dos números reales:
    
    private double N1;
    private double N2;

    public ParDeNumeros() {
       this.N1 = (Math.round(Math.random()*50+1)/2d);
       this.N2 = (Math.round(Math.random()*50+1)/2d);
    }

    public double getN1() {
        return N1;
    }

    public void setN1(double N1) {
        this.N1 = N1;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double N2) {
        this.N2 = N2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "N1=" + N1 + ", N2=" + N2 + '}';
    }
    
    
    
    


    
    
    
    
}
