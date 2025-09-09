/*
Student ID   : 67040233116
Student Name : Suteerapat Kansomprot
*/

public abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    protected abstract boolean validate();
    protected abstract boolean pay();

    public void processPayment() {
        if (validate() && pay()) {
            System.out.printf("Payment of %.2f completed%n", amount);
        } else {
            System.out.println("Payment failed");
        }
    }

    public double getAmount() {
        return amount;
    }
}
