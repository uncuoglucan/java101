import java.util.Scanner;

public class RecursiveUslu {

    static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int exponent = scanner.nextInt();

        System.out.println("Sonuç : " + power(base, exponent));

        scanner.close();
    }
}
