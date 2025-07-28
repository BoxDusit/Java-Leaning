public class TestEmployee {
    public static void main(String[] args) {

        System.out.println("-----------------------------");

        Manage m1 = new Manage("Dusit","67040233115",45000,0.49,5);
        m1.calculateSalary(m1.baseSalary,m1.setBonus());
    }
}
