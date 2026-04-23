import java.util.Scanner;

public class RecursiveBesCikar {

    static void calculate(int n) {
        System.out.print(n + " ");
        if (n <= 0) return;
        calculate(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int n = scanner.nextInt();

        calculate(n);

        scanner.close();
    }
}
