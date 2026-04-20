import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Hipotenüs hesabı
        System.out.print("1. dik kenar: ");
        double a = input.nextDouble();

        System.out.print("2. dik kenar: ");
        double b = input.nextDouble();

        double hipotenus = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + hipotenus);

        // Üçgen alanı (Heron formülü)
        System.out.print("3 kenarı giriniz (a b c): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        double u = (x + y + z) / 2;
        double alan = Math.sqrt(u * (u - x) * (u - y) * (u - z));

        System.out.println("Üçgenin Alanı: " + alan);

        input.close();
    }
}