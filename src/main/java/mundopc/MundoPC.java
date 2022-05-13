
package mundopc;

import com.gm.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorLogitech = new Monitor("Logitech", 14);
        Teclado tecladoLogitech = new Teclado("bluetooth", "Logitech");
        Raton ratonLogitech = new Raton("bluetooth", "Logitech"); 
        Computadora computadoraLogitech = new Computadora("ComputadoraLogitech", monitorLogitech, tecladoLogitech, ratonLogitech);
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraLogitech);
        orden1.mostrarOrden();
        
        
                
    }
    
}
