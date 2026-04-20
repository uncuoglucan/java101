import java.util.Scanner;

public class KdvProgramı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        double tutar = input.nextDouble();

        double kdvOrani = (tutar > 0 && tutar <= 1000) ? 0.18 : 0.08;

        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);

        input.close();
    }
}