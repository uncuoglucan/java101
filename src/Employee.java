public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        return salary >= 1000 ? salary * 0.03 : 0;
    }

    public double bonus() {
        return workHours > 40 ? (workHours - 40) * 30.0 : 0;
    }

    public double raiseSalary() {
        int years = 2021 - hireYear;
        if (years < 10) return salary * 0.05;
        else if (years < 20) return salary * 0.10;
        else return salary * 0.15;
    }

    @Override
    public String toString() {
        double vergi = tax();
        double bonus = bonus();
        double zam   = raiseSalary();
        double netMaas  = salary - vergi + bonus;
        double toplamMaas = netMaas + zam;

        return "Adı : " + name + "\n" +
               "Maaşı : " + salary + "\n" +
               "Çalışma Saati : " + workHours + "\n" +
               "Başlangıç Yılı : " + hireYear + "\n" +
               "Vergi : " + vergi + "\n" +
               "Bonus : " + bonus + "\n" +
               "Maaş Artışı : " + zam + "\n" +
               "Vergi ve Bonuslar ile birlikte maaş : " + netMaas + "\n" +
               "Toplam Maaş : " + toplamMaas;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(e1);
    }
}
