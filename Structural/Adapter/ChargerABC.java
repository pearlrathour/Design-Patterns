package Structural.Adapter;

public class ChargerABC implements AndroidCharger{
    @Override
    public void chargerAndroidPhone() {
        System.out.println("Your Android Phone is Charging");
    }
}
