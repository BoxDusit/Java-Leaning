import java.util.Scanner;

public class CalculateGrade {
    static Scanner input = new Scanner(System.in);

    static String[] name;
    static int[] midscore;
    static int[] finals;
    static int[] totalscore;
    static String[] grade;
    static int count;

    public static void main(String[] args) {
        System.out.println("++++ Grade calculate program ++++");
        System.out.print("Enter number of students => ");
        count = input.nextInt();

        input.nextLine();

        name = new String[count];
        midscore = new int[count];
        finals = new int[count];
        totalscore = new int[count];
        grade = new String[count];

        inputData();
        calculateData();
        printReport();
    }

    public static void inputData() {
        for (int i = 0; i < count; i++) {
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("Student no." + (i+1));

            System.out.print("\tStudent name ==> ");
            name[i] = input.nextLine();

            System.out.print("\tMidterm score ==> ");
            midscore[i] = input.nextInt();

            System.out.print("\tFinal score ==> ");
            finals[i] = input.nextInt();

            input.nextLine();
        }
    }

    public static void calculateData() {
        for (int i=0;i<count;i++) {
            totalscore[i] = getScore(midscore[i],finals[i]);
            grade[i] = getGrade(totalscore[i]);
        }
    }

    public static void printReport() {
        showReport();
        for (int i=0; i<count; i++) {
            System.out.printf("%-25s %7d %10s\n",name[i],totalscore[i],grade[i]);
        }
    }

    public static int getScore(int midscore, int finalscore) {
        return midscore + finalscore;
    }

    public static String getGrade(int score) {
        if (score>= 80){
            return "A";
        }else if(score>=75){
            return "B+";
        }else if(score>=70){
            return "B";
        }else if(score>=65){
            return "C+";
        }else if(score>=60){
            return "C";
        }else if(score>=55){
            return "D+";
        }else if(score>=50){
            return "D";
        }else{
            return "F";
        }
    }

    public static void showReport(){
        System.out.println("\n\t+++++++ Student grade report +++++++");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-25s %7s %10s\n", "Student name", "Score", "Grade");
        System.out.println("-----------------------------------------------");
    }
}