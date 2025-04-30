package _2904.observer;

public class KuechenAnzeige implements Observer{
    @Override
    public void aktualisieren(float temperatur) {
        System.out.println("Küche, draußen ist es: " + temperatur + "°C");
    }
}
