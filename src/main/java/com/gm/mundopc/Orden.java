
package com.gm.mundopc;


public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 5;
    
    public Orden(){
       this.idOrden = ++contadorOrdenes; 
    }
    
    public void agregarComputadora(Computadora computadora){
                if (this.contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de productos = " + MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
//        System.out.println("Orden #" + this.idOrden);
//        System.out.println("Total de la Orden: $" + this.calcularTotal());
//        System.out.println("Productos de la Orden:");
//        for (int i = 0; i < this.contadorProductos; i++) {
//            System.out.println(productos[i]);
//        }
          System.out.println("Orden #" + this.idOrden);
          System.out.println("Computadoras de la Orden:");
          for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
