//67040233115 Dusit Phaisan
public class EmployeeTest {
    public static void main(String[] args) {
        FulltimeEmployee f1 = new FulltimeEmployee("E001","Dusit","Sefe",12000);
        f1.showInfo();
        f1.calculatePay();

        System.out.println();

        PartTimeEmployee p1 = new PartTimeEmployee("E025","Rewadee","Other",45,80);
        p1.showInfo();
        p1.calculatePay();
    }
}
