
package com.gm.mundopc2;


public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS  = 10;
    
    public Orden(){
    this.idOrden = ++Orden.contadorOrdenes;
    Computadora computadoras[] = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void AgregarComputadora(Computadora computadora){
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        }
        
        
    }
    
    
}
