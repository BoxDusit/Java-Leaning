import java.util.InputMismatchException;
import java.util.Scanner;
public class DevideByZero {
    public static int qoutient(int num,int dominator){
        return  num/dominator;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        try{
            System.out.print("Enter integer number ==> ");
            int num = input.nextInt();
            System.out.print("Enter dominator ==> ");
            int deno = input.nextInt();

            int result = qoutient(num,deno);
            System.out.println("--------------------------------");
            System.out.printf("Result of %d / %d = %d\n",num,deno,result);
        }catch (ArithmeticException ex){
            System.out.println("Zero is an invalid dominator ....");
            System.out.println("Can not devide by zero ....");
        }catch (InputMismatchException ex2){
            System.out.println("You must input integer number....");
        }finally {
            System.out.println("++++++++++++++++++++++++++++++++++");
        }


    }

}
