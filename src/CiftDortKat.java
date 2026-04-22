import java.util.Scanner;

public class CiftDortKat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int sayi;

        do {
            System.out.print("Bir Sayı Giriniz : ");
            sayi = scanner.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi >= 10 || sayi <= -10);

        System.out.println("Çift ve 4'ün Katı Sayıların Toplamı : " + toplam);

        scanner.close();
    }
}
