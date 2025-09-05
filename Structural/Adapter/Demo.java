package Structural.Adapter;

public class Demo {
    public static void main(String[] args) {
        // CASE 1: iPhone charger availavle for iPhone
        IphoneCharger iphoneCharger1= new ChargerXYZ();
        Iphone iphone1= new Iphone(iphoneCharger1);
        iphone1.chargeIphone();

        // Case 2: Android charger available for iPhone
        IphoneCharger iphoneCharger2= new AdapterCharger(new ChargerABC());
        Iphone iphone2= new Iphone(iphoneCharger2);
        iphone2.chargeIphone();
    }
}
          