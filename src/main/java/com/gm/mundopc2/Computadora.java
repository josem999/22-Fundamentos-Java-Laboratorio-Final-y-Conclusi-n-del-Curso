
package com.gm.mundopc2;


public class Computadora {
    private static int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    
    private Computadora(){
        this.idComputadora = ++Computadora.idComputadora;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.raton = raton;
        this.teclado = teclado;
        this.monitor = monitor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Monitor getMonitor(){
        return monitor;
    }
    
    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
    
    public Teclado getTeclado(){
        return teclado;
    }
    
    public void setTeclado(Teclado teclado){
        this.teclado = teclado;
    }
    
    public Raton getRaton(){
        return raton;
    }
    
    public void setRaton(Raton raton){
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
    
    
    
    
}
