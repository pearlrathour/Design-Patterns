import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;
    private static final ReentrantLock lock = new ReentrantLock();

    private SynchronizedSingleton() {
        System.out.println("Synchronized Singleton instance created");
    }

    public static SynchronizedSingleton getInstance() {
        if (instance == null) {
            System.out.println("Attempting to acquire lock....");
            synchronized (SynchronizedSingleton.class) {
                System.out.println("Lock acquired by " + Thread.currentThread().getName());
                if (instance == null) {
                    instance = new SynchronizedSingleton();
                }
                System.out.println("Releasing lock by " + Thread.currentThread().getName());
            }
        }
        return instance;
    }
}