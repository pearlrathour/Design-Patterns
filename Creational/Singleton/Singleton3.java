package Creational.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Singleton3{
    public static void main(String[] args) throws Exception, CloneNotSupportedException{
        Singleton instance1= Singleton.getInstance();
        System.out.println(instance1.hashCode());
        Singleton instance2= Singleton.getInstance();
        System.out.println(instance2.hashCode());

        // Break Singleton Pattern 

        // 1. Reflection API
        Constructor<Singleton> cons= Singleton.class.getDeclaredConstructor(null);
        cons.setAccessible(true);
        Singleton instance3= cons.newInstance();
        System.out.println(instance3.hashCode());

        // Enum- prevent reflection
        Singleton4 instance4= Singleton4.INSTANCE;
        System.out.println(instance4.hashCode());

        // 2. Deserialisation
        Singleton instance5= Singleton.getInstance();
        System.out.println(instance5.hashCode());
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance5);
        System.out.println("Serialization done");

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton instance6 = (Singleton)in.readObject();
        System.out.println(instance6.hashCode());


        //3. Cloning
        Singleton instance7 = (Singleton) instance1.clone();
        System.out.println(instance7.hashCode());
    }
}