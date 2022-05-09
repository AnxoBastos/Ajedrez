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
public class Posicion{
    
    private final int ejeX;
    private final int ejeY;
    
    public Posicion(int ejeX, int ejeY){
        Preconditions.checkArgument(ejeX >= 1 && ejeX <= 8);
        Preconditions.checkArgument(ejeY >= 1 && ejeY <= 8);
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    @Override
    public int hashCode(){
        int hash = 5;
        hash = 11 * hash + this.ejeX;
        hash = 11 * hash + this.ejeY;
        return hash;
    }

    public int getEjeX(){
        return ejeX;
    }

    public int getEjeY(){
        return ejeY;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Posicion other = (Posicion)obj;
        if(this.ejeX != other.ejeX){
            return false;
        }
        if(this.ejeY != other.ejeY){
            return false;
        }
        return true;
    }
    
    
    
}
