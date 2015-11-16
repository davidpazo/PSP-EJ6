package hilos;

/**
 *
 * @author dpazolopez
 */
public class Productor extends Thread{
     Ejercicio6 extraccion;

    public Productor(Ejercicio6 extraccion) {
        this.extraccion = extraccion;
    }
     
     @Override
     public void run() {
         for (int i = 0; i < 10; i++) {
             extraccion.productor();
         }
     }
}
