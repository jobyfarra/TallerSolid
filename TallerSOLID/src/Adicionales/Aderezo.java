/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
public abstract class Aderezo {
    //MALVAVISCOS,FRUTILLA,CREMA
    
    protected String name;

    public Aderezo(String name) {
        this.name = name;
    }
    
    public abstract void setName(String name);

    public String getName() {
        return name;
    }
    
    
    @Override
    public String toString() {
        return name.toUpperCase();
    }
    
    
}
