package ogrenci;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;
    double sozluEtkisi; // 0.0 - 1.0 arası (örn: 0.20 = %20)

    public Course(String name, String code, String prefix, double sozluEtkisi) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNote = 0;
        this.sozluEtkisi = sozluEtkisi;
    }

    // Sözlü ve sınav notlarını birleştirerek ağırlıklı ders notunu döner
    public double calcWeightedNote() {
        return (sozluNote * sozluEtkisi) + (note * (1 - sozluEtkisi));
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
