import java.util.Scanner;

public class BolunenOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            System.out.println("Ortalama : " + (double) toplam / adet);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }

        scanner.close();
    }
}
