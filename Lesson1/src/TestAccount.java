import java.util.Scanner;
public class TestAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount acc1 = new BankAccount();
        System.out.println("Current balance = " + acc1.getBalance());

        System.out.println("++++ Menu ++++");
        System.out.println(" 1 : Deposit");
        System.out.println(" 2 : Withdraw");
        System.out.println(" 3 : Show balance");
        System.out.println("++++++++++++++++");
        System.out.print("Enter menu ==> ");
        int menu = input.nextInt();

        while (menu>=1 && menu<=3){
            if(menu==1){
                System.out.print("Enter amount to deposit ==> ");
                acc1.deposit(input.nextDouble());

            }else if(menu==2){
                System.out.print("Enter amount to withdraw ==> ");
                acc1.withdraw(input.nextDouble());

            }else if(menu==3){
                System.out.println("Current Balance = " + acc1.getBalance());
            }

            System.out.println("--------------------------------------");
            System.out.print("Enter menu ==> ");
            menu = input.nextInt();



        }



    }
}
