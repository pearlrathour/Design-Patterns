package Creational.Singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
    
    //static as we can only use static variable inside static method
    private static Singleton instance;
    
    private Singleton(){
        // prevent reflection 
        // if(instance!=null){
        //     throw new RuntimeException("You are tryig to break singleton pattern");
        // }
    }

    //Lazy Initialization
    //static as this method will not require object creation
    public static Singleton getInstance(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }

    // prevents serialization
    public Object readResolve(){
        return instance;
    }

    // cloning
    public Object clone() throws CloneNotSupportedException{
        return instance;
        // prevent cloning
        // throw new CloneNotSupportedException();
    }
}