package hilos;

/**
 *
 * @author dpazolopez
 */
public class Consumidor extends Thread{
    Ejercicio6 compra;
    public Consumidor(Ejercicio6 obx) {
        this.compra=obx;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            compra.consumidor();
        }
    }
}

