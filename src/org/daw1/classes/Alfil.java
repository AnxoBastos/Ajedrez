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
public class Alfil extends Pieza{

    public Alfil(boolean isBlanco, Posicion posicion){
        super(isBlanco, posicion);
    }

    @Override
    public boolean isValidoMovimiento(Posicion p){
        if(super.isValidoMovimiento(p)){
            int ejeX = Math.abs(this.getPosicion().getEjeX() - p.getEjeX());
            int ejeY = Math.abs(this.getPosicion().getEjeY() - p.getEjeY());
            return ejeX == ejeY;
        }
        else{
            return false;
        }
    }

    @Override
    public String saludar(){
        return "Soy un alfil " + (this.isBlanco() ? "blanco" : "negro");
    }
      
}
