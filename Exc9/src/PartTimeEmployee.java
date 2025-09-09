//67040233115 Dusit Phaisan
public class PartTimeEmployee extends Employee{
    private double hourlyRate ;
    private int hoursWorked;

    public PartTimeEmployee(String id,String name,String type ,double hourlyRate,int hoursWorked){
        super(id, name, type);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate*hoursWorked;
    }

    @Override
    public void showInfo() {
        System.out.println("++++ PartTime Employee +++++");
        super.showInfo();
        System.out.println("Wages : "+calculatePay());
    }
}
