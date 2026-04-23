public class Frekans {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] islendi = new boolean[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            if (islendi[i]) continue;

            int sayac = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    sayac++;
                    islendi[j] = true;
                }
            }

            System.out.println(dizi[i] + " sayısı " + sayac + " kere tekrar edildi.");
        }
    }
}
