
package com.gm.mundopc;


public class Monitor {
    private final int idMonitor; // final para tener un identificador unico por cada objeto del tipo monitor que se utilice
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    private Monitor(){
        idMonitor = ++contadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this(); //llamar el constructor vacio para inicializar la variable idmonitor
        this.marca = marca;
        this.tamanio = tamanio;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }
    
    
    

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
    
}
