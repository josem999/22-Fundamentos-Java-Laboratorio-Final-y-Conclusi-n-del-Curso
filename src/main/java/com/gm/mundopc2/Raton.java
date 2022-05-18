package com.gm.mundopc2;

public class Raton extends DispositivoEntrada{

    private final int idRaton; //Es final para que no se pueda modificar una vez inicializada
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);  //inicializar atributos de la clase padre
        this.idRaton = ++Raton.contadorRatones; 
    }
    
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + " }";
    }
}
