import java.util.Scanner;

public class PalindromKelime {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = input.nextLine().toLowerCase();

        if (isPalindrome(kelime))
            System.out.println("\"" + kelime + "\" palindromik bir kelimedir.");
        else
            System.out.println("\"" + kelime + "\" palindromik bir kelime değildir.");
    }
}
