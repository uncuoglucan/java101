import java.util.Scanner;

public class EventRec {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sicaklik;

        System.out.print("Sıcaklık: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak");
        } else if (sicaklik <= 15) {
            System.out.println("Sinema");
        } else if (sicaklik <= 25) {
            System.out.println("Piknik");
        } else {
            System.out.println("Yüzme");
        }
    }
}