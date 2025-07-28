public class TestStudent {
    public static void main(String[] args) {

        Student std1 = new Student("11111","วิมล",20,2.75);
        std1.displayStudentInfo();
        Student std2 = new Student();
        std2.displayStudentInfo();
        std2.setStudentId("");
    }
}
