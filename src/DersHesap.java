import java.util.Scanner;

public class DersHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik;
        int toplam = 0, sayac = 0;

        System.out.print("Matematik notu: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            sayac++;
        }

        System.out.print("Fizik notu: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            sayac++;
        }

        System.out.print("Türkçe notu: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            sayac++;
        }

        System.out.print("Kimya notu: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            sayac++;
        }

        System.out.print("Müzik notu: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            sayac++;
        }

        if (sayac == 0) {
            System.out.println("Geçerli not girilmedi!");
            return;
        }

        double ortalama = (double) toplam / sayac;

        System.out.println("Ortalama: " + ortalama);

        if (ortalama >= 55) {
            System.out.println("Sınıfı Geçti");
        } else {
            System.out.println("Sınıfta Kaldı");
        }
    }
}