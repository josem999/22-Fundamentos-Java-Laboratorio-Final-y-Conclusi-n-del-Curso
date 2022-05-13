
package com.gm.mundopc;


public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca); //<--repasar uso palabra super
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado( ) {
        return idTeclado;
    }
    
    @Override
    public String toString(){
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() +"}";
    }

}
