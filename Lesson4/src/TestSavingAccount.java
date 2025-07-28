import java.util.Scanner;

public class TestSavingAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingAccount acc1 = new SavingAccount();

        System.out.println("Input saving account data.....");
        System.out.print("Account Number => ");
        acc1.setAccountNumber(input.next());
        System.out.print("Account Name => ");
        acc1.setAccountHolder(input.next());
        System.out.print("Account Balance => ");
        acc1.setBalance(input.nextDouble());
        System.out.print("Interest rate => ");
        acc1.setInterestRate(input.nextDouble());

        showMenu();

        System.out.print("Enter menu choice =>");
        int menu = input.nextInt();

        while (menu !=0){
            if(menu==1){
                System.out.println("Current balance : " + acc1.getBalance());
            } else if (menu==2) {
                System.out.print("Enter amount to deposite => " );
                acc1.deposit(input.nextDouble());
            } else if (menu==3) {
                System.out.print("Enter amount to withdraw => " );
                acc1.withdraw(input.nextDouble());
            } else if (menu==4) {
                System.out.println("Interest : "+acc1.getInterestRate());
            }else{
                System.out.println("++++ Invalid menu choice!!! ++++\n ");
            }

            System.out.println("------------------------------------------");
            System.out.print("Enter menu choice => ");
            menu = input.nextInt();
        }
    }


    public static void showMenu(){
        System.out.println(" +++++ Menu +++++\n");
        System.out.println("1 : Show current balance");
        System.out.println("2 : Deposit");
        System.out.println("3 : Withdraw");
        System.out.println("4 : Calculate interest");
        System.out.println("0 : Exit");
        System.out.println(" ---------------- ");

    }

}
