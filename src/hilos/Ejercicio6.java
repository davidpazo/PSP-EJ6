package hilos;

/**
 *
 * @author dpazolopez
 */
public class Ejercicio6 extends Thread {

    static int caja = 0;

    public static void main(String[] args) {
        Ejercicio6 ej6 = new Ejercicio6();
        Productor pro = new Productor(ej6);
        Consumidor con = new Consumidor(ej6);

        pro.start();
        con.start();
    }

    synchronized public void productor() {

        caja = caja + 1;
        System.out.println("Suma --> " + caja);
        notify(); 
    }

    synchronized public void consumidor() {
        try {
            caja = caja - 1;
            wait(1000);
            System.out.println("Resta --> " + caja);
        } catch (InterruptedException ex) {
            System.out.println("Interrupcion"+ ex);
        }

    }
}
