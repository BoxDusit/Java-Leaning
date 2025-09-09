import java.util.Scanner;
public class IndexOutOfBoudTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String[] member = {"Rewadee" , "Khunawut"};

        System.out.print("Enter member no.(1-5) ==> ");
        int no = input.nextInt();

        while(no>0){
            System.out.printf("Member no.%d is %s\n",no,member[no-1]);
            System.out.println("----------------------------------");
            System.out.print("Enter member ");
        }
    }
}
