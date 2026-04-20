import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14;

        // Daire alanı ve çevresi
        System.out.print("Yarıçap (r): ");
        double r = input.nextDouble();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        // Daire dilimi alanı
        System.out.print("Merkez açı (α): ");
        double alpha = input.nextDouble();

        double daireDilimAlani = (pi * (r * r) * alpha) / 360;

        System.out.println("Daire Dilimi Alanı: " + daireDilimAlani);

        input.close();
    }
}