import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen mesafe (KM): ");
        double km = input.nextDouble();

        double acilisUcreti = 10;
        double kmBasiUcret = 2.20;

        double toplamTutar = acilisUcreti + (km * kmBasiUcret);

        if (toplamTutar < 20) {
            toplamTutar = 20;
        }

        System.out.println("Toplam Tutar: " + toplamTutar);

        input.close();
    }
}