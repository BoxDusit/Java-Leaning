//67040233115 Dusit Phaisan
public class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(String id , String name , String type,double monthlySalary){
        super(id, name, type);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public void showInfo() {
        System.out.println("++++ FullTime Employee +++++");
        super.showInfo();
        System.out.println("Salary : "+monthlySalary);
    }


}
