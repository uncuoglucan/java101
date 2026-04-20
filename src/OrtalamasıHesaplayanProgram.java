import java.util.Scanner;

public class OrtalamasıHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        int matematik = input.nextInt();

        System.out.print("Fizik notu: ");
        int fizik = input.nextInt();

        System.out.print("Kimya notu: ");
        int kimya = input.nextInt();

        System.out.print("Türkçe notu: ");
        int turkce = input.nextInt();

        System.out.print("Tarih notu: ");
        int tarih = input.nextInt();

        System.out.print("Müzik notu: ");
        int muzik = input.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalama: " + ortalama);
        System.out.println(sonuc);

        input.close();
    }
}