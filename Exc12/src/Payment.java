//67040233115 Dusit Phaisan
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

}
