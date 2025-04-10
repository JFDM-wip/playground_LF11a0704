package _0904;

public class HundTest {
    public static void main(String[] args) {
        Hund bobby = new Hund("Yellow");
        System.out.println(bobby.getColor());

        Hund sam = new Hund("Brown", "Green");
        System.out.println(sam.getWeight());

        Hund schwarzerHund = new Hund();
        System.out.println(schwarzerHund.getColor());
    }
}
