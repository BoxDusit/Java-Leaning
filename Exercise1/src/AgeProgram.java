import java.util.Scanner;
public class AgeProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0;
        int count = 0;

        for (i=0;i<=10;i++){
            int age;
            System.out.print("Enter age => ");
            age = input.nextInt();

            if (age>=25 && age <=35){
                count++;
            }

        }
        System.out.println("Count 35-85 : "+count);
    }
}