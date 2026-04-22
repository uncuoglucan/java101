import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int sayi = scanner.nextInt();

        int tempSayi = Math.abs(sayi);
        int toplam = 0;

        while (tempSayi != 0) {
            toplam += tempSayi % 10;
            tempSayi /= 10;
        }

        System.out.println(sayi + " sayısının basamak toplamı : " + toplam);

        scanner.close();
    }
}
