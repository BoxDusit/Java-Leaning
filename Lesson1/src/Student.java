public class Student {
    //Attribute
    String studentID;
    String name;
    double gpa;

    //method
    void sayHello(){

        System.out.println("Hello...My name is " + name);
    }

    void  showStudentInfo(){
        System.out.println("Student Id : " + studentID);
        System.out.println("name : " + name);
        System.out.println("gpa : " + gpa);
    }
}

