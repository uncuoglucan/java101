import java.util.Scanner;

public class BiletFiyat {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Mesafeyi km türünden giriniz : ");
        double mesafe = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = scanner.nextInt();

        // Geçerlilik kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("\nHatalı Veri Girdiniz !");
            return;
        }

        // Normal tutar hesapla
        double normalTutar = mesafe * 0.10;

        // Yaş indirimi belirle
        double yasIndirimOrani = 0;
        if (yas < 12) {
            yasIndirimOrani = 0.50;
        } else if (yas <= 24) {
            yasIndirimOrani = 0.10;
        } else if (yas > 65) {
            yasIndirimOrani = 0.30;
        }

        // Yaş indirimi uygula
        double yasIndirimi = normalTutar * yasIndirimOrani;
        double indirimliTutar = normalTutar - yasIndirimi;

        // Gidiş-dönüş indirimi ve toplam tutar
        double toplamTutar;
        if (yolculukTipi == 2) {
            double gidisDonusIndirimi = indirimliTutar * 0.20;
            toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
        } else {
            toplamTutar = indirimliTutar;
        }

        // Sonucu yazdır
        if (toplamTutar == (int) toplamTutar) {
            System.out.println("\nToplam Tutar = " + (int) toplamTutar + " TL");
        } else {
            System.out.println("\nToplam Tutar = " + toplamTutar + " TL");
        }

        scanner.close();
    }
}