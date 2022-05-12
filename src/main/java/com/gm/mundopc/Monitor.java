
package com.gm.mundopc;


public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    private Monitor(){
        this.idMonitor = ++contadorMonitores; 
    }
    
    public Monitor(String marca, double tamanio){
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
    
    

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
    
}
