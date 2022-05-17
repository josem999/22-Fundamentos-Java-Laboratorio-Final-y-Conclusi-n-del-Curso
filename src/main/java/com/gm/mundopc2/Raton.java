package com.gm.mundopc2;

public class Raton {

    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super();
        this.idRaton = ++Raton.contadorRatones;
    }
    
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}';
    }
}
