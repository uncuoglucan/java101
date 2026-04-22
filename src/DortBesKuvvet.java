import java.util.Scanner;

public class DortBesKuvvet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int sayi = scanner.nextInt();

        System.out.println("4'ün Kuvvetleri:");
        long kuvvet4 = 1;
        for (int i = 0; kuvvet4 <= sayi; i++) {
            System.out.println("4^" + i + " = " + kuvvet4);
            kuvvet4 *= 4;
        }

        System.out.println("5'in Kuvvetleri:");
        long kuvvet5 = 1;
        for (int i = 0; kuvvet5 <= sayi; i++) {
            System.out.println("5^" + i + " = " + kuvvet5);
            kuvvet5 *= 5;
        }

        scanner.close();
    }
}
