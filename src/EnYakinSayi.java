public class EnYakinSayi {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilen = 5;

        Integer kucukEnYakin = null;
        Integer buyukEnYakin = null;

        for (int sayi : dizi) {
            if (sayi < girilen) {
                if (kucukEnYakin == null || sayi > kucukEnYakin) {
                    kucukEnYakin = sayi;
                }
            } else if (sayi > girilen) {
                if (buyukEnYakin == null || sayi < buyukEnYakin) {
                    buyukEnYakin = sayi;
                }
            }
        }

        System.out.println("Girilen Sayı: " + girilen);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukEnYakin);
    }
}
