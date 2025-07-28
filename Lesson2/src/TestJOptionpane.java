import javax.swing.JOptionPane;
public class TestJOptionpane {
    public static void main(String[] args) {
        double midtermScore = Double.parseDouble(JOptionPane.showInputDialog("Enter midterm score : "));
        double finalScore = Double.parseDouble(JOptionPane.showInputDialog("Enter final score : "));
        double totalScore = midtermScore+finalScore;

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
    JOptionPane.showMessageDialog(null,"Total score : "+ totalScore +"\nGrade :"+grade);
    }
}
