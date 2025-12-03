import java.util.Scanner;

public class HightProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] score = new int[3][5];
        String[] subject = new String[] {"Computer", "Math    ", "Physic  "};
        int maxsubject = 0;

        //วิชา
        for (int i=0;i<3;i++){
            System.out.print("\n"+subject[i]+"\n");
            for (int j=0;j<5;j++){
                System.out.print("Enter no."+(j+1)+" Score => ");
                score[i][j] = input.nextInt();

                if (maxsubject<=score[i][j]){
                    maxsubject = score[i][j];
                }
            }
            System.out.println("Height Score : "+maxsubject);
            maxsubject=0;
        }

        System.out.print("\n");

        System.out.println("===========================================================");
        System.out.println("|                 Student Subject ScoreBord               |");
        System.out.println("===========================================================");
        for (int i=0;i<3;i++){
            System.out.print(subject[i]);
            for (int j=0;j<5;j++){
                System.out.printf(" | %5d  ",score[i][j]);
            }
            System.out.print("|\n");
        }
        System.out.println("===========================================================");


    }
}
