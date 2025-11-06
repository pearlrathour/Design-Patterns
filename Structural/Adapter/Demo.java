package Structural.Adapter;

public class Demo {
    public static void main(String[] args) {
        EuropeanPlug euroPlug = new EuropeanPlug();
        USPlug adapter = new PlugAdapter(euroPlug);

        adapter.connectToUSSocket();
    }
}
          