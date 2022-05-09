/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daw1;

import org.daw1.classes.*;

/**
 *
 * @author alumno
 */
public class Ajedrez{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        java.util.List<Pieza> lista = new java.util.LinkedList<>();
        lista.add(new Torre(true, new Posicion(1,1)));
        lista.add(new Alfil(true, new Posicion(2,2)));
        lista.add(new Caballo(true, new Posicion(3,3)));
    }
    
}
