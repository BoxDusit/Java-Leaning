
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        System.out.print("Enter midterm score => ");
        double midtermScore = input.nextDouble();
        System.out.print("Enter final score => ");
        double finalscore = input.nextDouble();
        double totalScore = midtermScore + finalscore;
        String grade;
        if(totalScore>=80){
            grade = "A";
        }else if(totalScore>=75){
            grade = "B+";
        }else if(totalScore>=70){
            grade = "B";
        }else if(totalScore>=65){
            grade = "C";}
        else if(totalScore>=60){
            grade = "C";
        }else if(totalScore>=55){
            grade = "D+";
        }else if(totalScore>=50){
            grade = "D";
        }else {
            grade = "F";
        }

        System.out.println("----------------------------------");
        System.out.println("Total score : " + totalScore);
        System.out.println("Grade        :    " + grade);
    }
}
