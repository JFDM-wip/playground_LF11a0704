package _2904.observer;

import java.util.ArrayList;
import java.util.List;

public class Wetterstation {
    private List<Observer> beobachterListe = new ArrayList<>();
    private float temperatur;

    public void addBeobachter(Observer beobachter) {
        beobachterListe.add(beobachter);
    }

    public void removeBeobachter(Observer beobachter) {
        beobachterListe.remove(beobachter);
    }

    public void setTemperatur(float temperatur) {
        this.temperatur = temperatur;
        benachrichtigeBeobachter();
    }

    private void benachrichtigeBeobachter() {
        for (Observer beobachter : beobachterListe) {
            beobachter.aktualisieren(temperatur);
        }
    }

}
