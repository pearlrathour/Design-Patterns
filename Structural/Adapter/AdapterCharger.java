package Structural.Adapter;

public class AdapterCharger implements IphoneCharger{
    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargePhone() {
        androidCharger.chargerAndroidPhone();
        System.out.println("Your Phone is charging with Adapter");
    }
}
