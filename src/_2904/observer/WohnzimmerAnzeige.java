package _2904.observer;

public class WohnzimmerAnzeige implements Observer {
    @Override
    public void aktualisieren(float temperatur) {
        System.out.println("Wohnzimmer, draußen ist es: " + temperatur + "°C");
    }
}
