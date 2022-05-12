
package com.gm.mundopc;


public class Raton {
    private int idRaton;
    private static int contadorRatones;
    
    public Raton(){
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}';
    }

    public int getIdRaton() {
        return idRaton;
    }

    
    
    
    
    
}
