
package com.gm.mundopc2;


public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS  = 3;
    
    public Orden(){
    this.idOrden = ++Orden.contadorOrdenes;
    computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void AgregarComputadora(Computadora computadora){
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            this.computadoras[Orden.contadorComputadoras++] = computadora;
        }else {
            System.out.println("Has superado el limite de computadoras: " + MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden numero: " + this.idOrden);
        System.out.println("Computadoras de la orden:");
        for (int i = 0; i < Orden.contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
    
    
}
