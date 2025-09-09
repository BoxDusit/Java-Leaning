//67040233115 Dusit Phaisan
public abstract class Employee {
    private String id;
    private String name;
    private String type;

    public Employee(String id , String name , String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    //method get
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void showInfo(){
        System.out.println("Employee ID   : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Type : "+type);
    }
    public abstract double calculatePay();

    ;
}
