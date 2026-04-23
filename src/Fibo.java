import java.util.*;
import java.io.*;

class Fibo {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            long a = in.nextLong();
            long b = in.nextLong();
            int n = in.nextInt();

            StringBuilder sb = new StringBuilder();
            long current = a + b;

            for (int j = 0; j < n; j++) {
                if (j > 0) sb.append(" ");
                sb.append(current);
                current = 2 * current + (b - a);
            }

            System.out.println(sb.toString());
        }

        in.close();
    }
}