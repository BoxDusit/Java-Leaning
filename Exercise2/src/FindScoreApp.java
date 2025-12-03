import java.util.Scanner;
public class FindScoreApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int score = 0;
        MyLinkList list = new MyLinkList();

        System.out.println("=== รับคะแนนนักศึกษา 5 คน ===\n");

        for (int i = 0; i < 5; i++){
            System.out.print("Input score " + (i + 1) + " : ");

            score = input.nextInt();
            list.add(score);
        }

        list.ShowScore();
        list.findMinScore();
        list.findMaxScore();
        list.AverageScre();






    }
}
