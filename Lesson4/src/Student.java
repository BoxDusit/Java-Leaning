public class Student {
    private String studentId;
    private String name ;
    private int age ;
    private double gpa;

    //getter/setter
    public String getStudentId(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }



    public void setStudentId(String studentId){
        if (studentId!=null && !studentId.isEmpty()){
            this.studentId = studentId;
        }else{
            System.out.println("Student id cannont be empty!!!");
        }

    }
    public void setName(String name){
        this.name = name;

    }
    public void setAge(int age){
        this.age = age;

    }
    public void setGpa(double gpa){
        this.gpa = gpa;

    }

    public void displayStudentInfo(){
        System.out.println("Student id : "+studentId);
        System.out.println("Name       : "+name);
        System.out.println("Age        : "+age);
        System.out.println("GPA        : "+gpa);
        System.out.println("------------------------------");
    }

    public Student(){
        studentId="N/A";
        name="N/A";
    }

    public Student(String studentId,String name,int age,double gpa){
        this.studentId=studentId;
        this.name=name;
        this.age=age;
        this.gpa=gpa;

    }



}




