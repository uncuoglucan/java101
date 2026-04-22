import java.util.Scanner;

public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int enBuyuk = sayi;
        int enKucuk = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi > enBuyuk) enBuyuk = sayi;
            if (sayi < enKucuk) enKucuk = sayi;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        scanner.close();
    }
}
