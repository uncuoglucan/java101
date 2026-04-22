import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı Giriniz : ");
        int taban = scanner.nextInt();

        System.out.print("Üssü Giriniz : ");
        int us = scanner.nextInt();

        long sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + "^" + us + " = " + sonuc);

        scanner.close();
    }
}
