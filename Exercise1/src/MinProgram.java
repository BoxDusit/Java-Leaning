import java.util.Scanner;
public class MinProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[10];


        System.out.print("\n**** Enter 10 ScoreFor MIN ****   \n\n");
        System.out.print("Enter no."+(1)+" Score => ");
        score[0] = input.nextInt();
        int minscore = score[0];

        for (int i=1;i<10;i++){
            System.out.print("Enter no."+(i+1)+" Score => ");
            score[i] = input.nextInt();

            if (minscore>=score[i]){
                minscore = score[i];
            }
        }

        System.out.print("\nMin score : "+minscore+"\n");
    }
}
