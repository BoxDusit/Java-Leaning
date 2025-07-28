public class Manage extends Employee {
    private double bonus;
    private int teamSize;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manage(String name, String id, double baseSalary,double bonus,int teamSize) {
        super(name, id, baseSalary);
        this.bonus=bonus;
        this.teamSize=teamSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus : "+bonus);
        System.out.println("TeamSize : "+teamSize);
    }

    @Override
    public double calculateSalary(double baseSalary, double bonus){
        return baseSalary+bonus;
    }
    @Override
    public void work(){
        System.out.print(name + " also managing the team.");
    }


    public void manageTeam(){

    }
}
