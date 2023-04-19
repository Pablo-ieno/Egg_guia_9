/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author iptal
 */
public class Cadena {

    //Atributos.-
    
    private String frase;
    private int longFrase;
    
    // Constructores.-

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longFrase=frase.length();
        
    }
    
    // Getters y Setters.-

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }
    
    
    
    
    

}
