/**
 * Created by jandruli on 11/15/16.
 */
public class Driver {
    public static void main(String[] args) {
        Thread t = new A();
        t.start();
        Runnable r = new B();
        Thread ta = new Thread(r);
        ta.start();
    }
}
