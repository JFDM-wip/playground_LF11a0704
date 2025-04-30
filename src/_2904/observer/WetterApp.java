package _2904.observer;

public class WetterApp {
    public static void main(String[] args) {
        Wetterstation wetterstation = new Wetterstation();

        Observer kueche = new KuechenAnzeige();
        Observer wohnzimmer = new WohnzimmerAnzeige();

        wetterstation.addBeobachter(kueche);
        wetterstation.addBeobachter(wohnzimmer);

        wetterstation.setTemperatur(22.8f);
        wetterstation.setTemperatur(18.5f);
    }
}
