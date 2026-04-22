import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armutFiyat   = 2.14;
        double elmaFiyat    = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat     = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut Kaç Kilo ? :");
        double armutKg = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        double elmaKg = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        double domatesKg = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        double muzKg = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlicanKg = scanner.nextDouble();

        double toplam = (armutKg * armutFiyat) +
                        (elmaKg * elmaFiyat) +
                        (domatesKg * domatesFiyat) +
                        (muzKg * muzFiyat) +
                        (patlicanKg * patlicanFiyat);

        System.out.printf("Toplam Tutar : %.2f TL%n", toplam);

        scanner.close();
    }
}
