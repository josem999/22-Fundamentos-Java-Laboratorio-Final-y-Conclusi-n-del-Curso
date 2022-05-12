
package com.gm.mundopc;


public class Teclado {
    private int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(){
        this.idTeclado = ++contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }
    
    @Override
    public String toString(){
        return "Teclado{" + "idTeclado=" + idTeclado + "}";
    }
}
