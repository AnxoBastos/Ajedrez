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
public class Caballo extends Pieza{

    public Caballo(boolean isBlanco, Posicion posicion){
        super(isBlanco, posicion);
    }
    
    @Override
    public boolean isValidoMovimiento(Posicion p){
        if(super.isValidoMovimiento(p)){
            int ejeX = Math.abs(this.getPosicion().getEjeX() - p.getEjeX());
            int ejeY = Math.abs(this.getPosicion().getEjeY() - p.getEjeY());
            return (ejeX == 2 && ejeY == 1) || (ejeX == 1 && ejeY == 2);
        }
        else{
            return false;
        }
    }
    
    @Override
    public String saludar(){
        return "Soy un caballo " + (this.isBlanco() ? "blanco" : "negro");
    }
    
}
