/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daw1.classes;

import com.google.common.base.Preconditions;
/**
 *
 * @author alumno
 */
public abstract class Pieza{
    
    private static int movimientosValidos = 0;
    private static int movimientosInvalidos = 0;
    private final boolean isBlanco;
    private Posicion posicion;
    
    protected Pieza(boolean isBlanco, Posicion posicion){
        Preconditions.checkNotNull(posicion);
        this.isBlanco = isBlanco;
        this.posicion = posicion;
    }

    public boolean isBlanco(){
        return isBlanco;
    }
    
    protected Posicion getPosicion(){
        return posicion;
    }
    
    protected boolean isValidoMovimiento(Posicion p){
        if(this.posicion == null){
            return false;
        }
        else if(p == null){
            return false;
        }
        else if(this.posicion.equals(p)){
            return false;
        }
        return true;
    }

    
    public boolean moverPieza(Posicion p){
        if(isValidoMovimiento(p)){
            this.posicion = p;
            movimientosValidos++;
            return true;
        }
        else{
            movimientosInvalidos++;
            return false;
        }
        
    }
    
    public abstract String saludar();
    
}
