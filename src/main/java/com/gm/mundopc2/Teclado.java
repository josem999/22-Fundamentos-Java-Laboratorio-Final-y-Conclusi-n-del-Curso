package com.gm.mundopc2;

public class Teclado {
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca){
        super();
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    
    public String toSring(){
        return "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
}
