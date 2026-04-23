package ogrenci;

public class Student {
    String name, stuNo;
    int classes;
    Course mat, fizik, kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
        calcAvarage();
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) this.mat.note = mat;
        if (fizik >= 0 && fizik <= 100) this.fizik.note = fizik;
        if (kimya >= 0 && kimya <= 100) this.kimya.note = kimya;
    }

    public void addBulkSozluNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) this.mat.sozluNote = mat;
        if (fizik >= 0 && fizik <= 100) this.fizik.sozluNote = fizik;
        if (kimya >= 0 && kimya <= 100) this.kimya.sozluNote = kimya;
    }

    public void calcAvarage() {
        this.avarage = (mat.calcWeightedNote() + fizik.calcWeightedNote() + kimya.calcWeightedNote()) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void isPass() {
        if (mat.note == 0 || fizik.note == 0 || kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %.2f%n", this.avarage);
            System.out.println(this.isPass ? "Sınıfı Geçti." : "Sınıfta Kaldı.");
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.printf("Matematik  -> Sınav: %d | Sözlü: %d | Ağırlıklı: %.2f%n",
                mat.note, mat.sozluNote, mat.calcWeightedNote());
        System.out.printf("Fizik      -> Sınav: %d | Sözlü: %d | Ağırlıklı: %.2f%n",
                fizik.note, fizik.sozluNote, fizik.calcWeightedNote());
        System.out.printf("Kimya      -> Sınav: %d | Sözlü: %d | Ağırlıklı: %.2f%n",
                kimya.note, kimya.sozluNote, kimya.calcWeightedNote());
    }
}
