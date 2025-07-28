public class TestStudent {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();

        std1.studentID = "67040233115";
        std1.name = "ดุสิต ไพศาล";
        std1.gpa = 4.0;

        std2.studentID = "67040233103";
        std2.name = "สิริสกุล คงคะรัศมี";
        std2.gpa = 3.0;

        std1.showStudentInfo();
        std2.showStudentInfo();
    }
}
