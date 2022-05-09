/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daw1.classes;

/**
 *
 * @author alumno
 */
public class Torre extends Pieza{

    public Torre(boolean isBlanco, Posicion posicion){
        super(isBlanco, posicion);
    }
    
    @Override
    public boolean isValidoMovimiento(Posicion p){
        if(super.isValidoMovimiento(p)){
            return this.getPosicion().getEjeX() == p.getEjeX() || this.getPosicion().getEjeY() == p.getEjeY();
        }
        else{
            return false;
        }
    }
    
    @Override
    public String saludar(){
        return "Soy una torre " + (this.isBlanco() ? "blanco" : "negro");
    }
}
