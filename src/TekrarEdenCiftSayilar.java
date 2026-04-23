public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] dizi = {4, 7, 2, 4, 8, 3, 2, 6, 8, 8, 1, 6};

        System.out.print("Dizi: ");
        for (int sayi : dizi) System.out.print(sayi + " ");
        System.out.println();

        System.out.print("Tekrar eden çift sayılar: ");

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 != 0) continue;

            boolean tekrarEdiyor = false;
            boolean dahaOnceYazildi = false;

            for (int j = 0; j < dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j]) tekrarEdiyor = true;
                if (j < i && dizi[i] == dizi[j]) dahaOnceYazildi = true;
            }

            if (tekrarEdiyor && !dahaOnceYazildi) System.out.print(dizi[i] + " ");
        }

        System.out.println();
    }
}
