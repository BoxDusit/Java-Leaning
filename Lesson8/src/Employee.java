public class Employee {
    private String id;
    private String name;
    private int age;
    private  double salary;

    //constructor
    public Employee(){
    }

    public Employee(String id , String name){
        this.id=id;
        this.name=name;
    }

    public Employee(String id, String name,int age , double salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    //method get

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    //method set

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showEmployeeInfo(){
        System.out.printf("%-10s : %s \n","id",id);
        System.out.printf("%-10s : %s \n","name",name);
        System.out.printf("%-10s : %d \n","age",age);
        System.out.printf("%-10s : %.2f \n","salary",salary);
        System.out.println("-----------------------");

    }

}
