import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        int n1 = scanner.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        int n2 = scanner.nextInt();

        int a = n1, b = n2;

        while (b != 0) {
            int kalan = a % b;
            a = b;
            b = kalan;
        }

        int ebob = a;
        int ekok = (n1 * n2) / ebob;

        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);

        scanner.close();
    }
}
