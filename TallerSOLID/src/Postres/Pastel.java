/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;



/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre {
	
	public Pastel(String sabor) {
		super(sabor);
		this.setPrecioParcial(15.55); ;
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Pastel {" + "sabor= " + this.getSabor() + ", precioParcial= " + this.getPrecioParcial() + ", aderezos= " + this.getAderezos() + '}';
    }
    
    
    
}
