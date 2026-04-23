package boks;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali", 15, 100, 70, 20.0);
        Fighter f2 = new Fighter("Veli", 12, 100, 68, 30.0);

        Ring ring = new Ring(f1, f2, 60, 80);
        ring.run();
    }
}
