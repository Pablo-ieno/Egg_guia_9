/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author iptal
 */
public class Meses {
    
    private String Meses[]={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio","agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto;

    public Meses() {
        this.mesSecreto = Meses[(int)(Math.random()*12)];
    }

    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return Meses;
    }

    public void setMeses(String[] Meses) {
        this.Meses = Meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
    
}
