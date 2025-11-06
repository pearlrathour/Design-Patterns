package Structural.Adapter;

class PlugAdapter implements USPlug {
    private EuropeanPlug europeanPlug;

    public PlugAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    public void connectToUSSocket() {
        System.out.println("Using adapter...");
        europeanPlug.connectToEuropeanSocket();
    }
}
