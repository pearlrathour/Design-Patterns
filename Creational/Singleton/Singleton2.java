package Creational.Singleton;
public class Singleton2{

    private static Singleton2 instance;

    private Singleton2(){

    }

    // synchronized method-> 1 thread at a time
    // but we do not want to sync everything in this method unecessarily

    // public synchronized static Singleton2 getInstance(){
    //     if(instance==null){
    //         Singleton2 instance= new Singleton2();
    //     }
    //     return instance;
    // }

    public static Singleton2 getInstance(){
        if(instance==null){
            // sync block
            // 1 thread at a time
            synchronized(Singleton2.class){
                if(instance==null){
                    Singleton2 instance= new Singleton2();
                }
            }
        }
        return instance;
    }
}