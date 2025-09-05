package Structural.Facade;

// Subsystems
class Amplifier {
    void on() { System.out.println("Amplifier ON"); }
}
class DvdPlayer {
    void play(String movie) { System.out.println("Playing: " + movie); }
}
class Projector {
    void on() { System.out.println("Projector ON"); }
}
class Lights {
    void dim() { System.out.println("Lights dimmed"); }
}

// Client
public class Main {
    public static void main(String[] args) {

        // Amplifier amp = new Amplifier();
        // DvdPlayer dvd = new DvdPlayer();
        // Projector projector = new Projector();
        // Lights lights = new Lights();

        // // Manual setup
        // lights.dim();
        // projector.on();
        // amp.on();
        // dvd.play("Inception");

        HomeTheaterFacade theater = new HomeTheaterFacade(
            new Amplifier(), new DvdPlayer(), new Projector(), new Lights()
        );

        theater.watchMovie("Inception");
    }
}

