public class Student {
    private String name;
    private int age;
    private String major;

    public Student(){
        this.name = "Unknow";
        this.age = 0;
        this.major="Undeclear";
    }

    public Student(String name){
        this.name = name;
        this.age = 0;
        this.major="Undeclear";
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        this.major="Undeclear";
    }

    public Student(String name,int age,String major){
        this.name = name;
        this.age = age;
        this.major=major;
    }

    public void showStudentInfo(){
        System.out.println("Name    : "+name);
        System.out.println("Age     : "+age);
        System.out.println("Major    : "+major);
    }

    class TestStudent{
        public static void main(String[] args) {
            Student std1 = new Student("BoyNarak");
            Student std2 = new Student("BoyNarak");
            Student std3 = new Student("BoyNarak");
            Student std4 = new Student("BoyNarak");
        }
    }



}
