/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import model.alumno;
import model.libro;

/**
 *
 * @author Roling Espinoza
 */
public class Principal {
    public static void main(String[] args) {
            alumno a= new alumno ();
            a.setNombres("Lionel");
            
               libro l= new  libro ();
               l.abrir();
               
    }
}
