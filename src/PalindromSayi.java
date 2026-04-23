import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int temp = sayi;
        int ters = 0;

        while (temp != 0) {
            ters = ters * 10 + temp % 10;
            temp /= 10;
        }

        if (ters == sayi) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }

        scanner.close();
    }
}
