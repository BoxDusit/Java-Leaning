public class SavingAccount {
    private String accountNumber ;
    private String accountHolder;
    private double balance;
    private double interestRate;

    //setter
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }

    //getter
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getGetAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public double getInterestRate(){
        return interestRate;
    }

    public void deposit(double amount){
        if (amount>0){
            balance += amount;
        }else{
            System.out.println("จำนวนเงินที่ฝากต้องมากกว่า 0 บาท");
        }
    }

    public void withdraw(double amount){
        if (amount>0 && balance>=amount){
            balance -= amount;
        }else if(amount <= 0){
            System.out.println("จำนวนเงินที่ถอนต้องมากกว่า 0 บาท");
        } else if (balance<amount) {
            System.out.println("จำนวนเงินในบัญชีไม่เพียงพอ....");
        }

    }

    public double calculateInterest(){
        return (balance * interestRate/100);

    }

}
