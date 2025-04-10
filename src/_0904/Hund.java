package _0904;

public class Hund {
    // Eigenschaften
    private String color;
    private String eyeColor;
    private double height;
    private double length;
    private double weight;

    // Konstruktoren
    public Hund() {
        this.color = "Black";
    }
    public Hund(String color) {
        this.color = color;
    }

    public Hund(String color, String eyeColor) {
        this(color, eyeColor, 30.0, 50.0, 30.0);
    }

    public Hund(String color, String eyeColor, double height, double length, double weight) {
        this.color = color;
        this.eyeColor = eyeColor;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    // Methoden
    public void sit(){
        System.out.println("Der Hund sitzt");
    }

    public void layDown() {
        System.out.println("Der Hund legt sich hin");
    }

    public void shake() {
        System.out.println("Der Hund schüttelt sich");
    }

    public void come() {
        System.out.println("Der Hund kommt");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
