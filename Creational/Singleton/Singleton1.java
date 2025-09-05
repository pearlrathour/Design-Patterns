package Creational.Singleton;
public class Singleton1{
    
    // if static is not there it will not be loaded at the start with class loading
    private static Singleton1 instance= new Singleton1();

    //Eager Initialization
    public static Singleton1 getInstance(){
        return instance;
    }
}