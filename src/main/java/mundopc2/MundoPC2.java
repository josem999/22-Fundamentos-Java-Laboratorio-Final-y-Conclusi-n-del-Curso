
package mundopc2;

import com.gm.mundopc2.Computadora;
import com.gm.mundopc2.Monitor;
import com.gm.mundopc2.Orden;
import com.gm.mundopc2.Raton;
import com.gm.mundopc2.Teclado;


public class MundoPC2 {
    public static void main(String[] args) {
        
        Teclado teclado1 = new Teclado("USB", "logitech");
        Raton raton1 = new Raton("USB", "Logitech");
        Monitor monitor1 = new Monitor("LG", 12.5);
        Computadora computadora1 = new Computadora("PC 1", monitor1, teclado1, raton1);
        
        Orden orden1 = new Orden();
        orden1.AgregarComputadora(computadora1);
        orden1.mostrarOrden();
    }
}
