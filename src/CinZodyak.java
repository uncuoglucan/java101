import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        int dogumYili = scanner.nextInt();

        String[] burclar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                            "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        String burc = burclar[dogumYili % 12];

        System.out.println("Çin Zodyağı Burcunuz : " + burc);

        scanner.close();
    }
}
