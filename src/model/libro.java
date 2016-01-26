/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Roling Espinoza
 */
public class libro {
    
   protected String titulo;
     protected String ISBN;
       protected boolean  abierto=false;
         protected int  numPaginas;
           protected int PaginaActual=0;
           
           public void abrir()
           {
               abierto=true;
           }
           
                 public void cerrar()
           {
               abierto=false;
           }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the abierto
     */
    public boolean isAbierto() {
        return abierto;
    }

    /**
     * @param abierto the abierto to set
     */
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    /**
     * @return the numPaginas
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    /**
     * @param numPaginas the numPaginas to set
     */
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    /**
     * @return the PaginaActual
     */
    public int getPaginaActual() {
        return PaginaActual;
    }

    /**
     * @param PaginaActual the PaginaActual to set
     */
    public void setPaginaActual(int PaginaActual) {
        this.PaginaActual = PaginaActual;
    }
    
           
           
}
