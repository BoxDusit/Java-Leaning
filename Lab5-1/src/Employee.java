public abstract class Employee {
    protected String name;
    protected String id;
    protected double baseSalary;

    public Employee(String name, String id, double baseSalary){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;

    }

    public void  displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Base salary : "+baseSalary);
    }

    public double calculateSalary(double baseSalary){
        return baseSalary ;
    }


    public abstract double calculateSalary(double baseSalary, double bonus);

    public void work(){
        System.out.print(name + " is working.");
    };

}
