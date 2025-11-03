public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Are both Singleton instances the same? " + (singleton1 == singleton2));

        // Sync Singleton
        Runnable task1 = () -> {
            SynchronizedSingleton instance = SynchronizedSingleton.getInstance();
        };

        Runnable task2 = () -> {
            SynchronizedSingleton instance = SynchronizedSingleton.getInstance();
        };

        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");

        t1.start();
        
    }
}
