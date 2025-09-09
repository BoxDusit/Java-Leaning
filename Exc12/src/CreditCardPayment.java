//67040233115 Dusit Phaisan
public class CreditCardPayment extends Payment implements Verifiable {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    protected boolean validate() {
        System.out.println("Validating credit card: " + cardNumber);
        return cardNumber != null && cardNumber.length() == 16;
    }

    @Override
    protected boolean pay() {
        return verify();
    }

    @Override
    public boolean verify() {
        System.out.println("Verifying OTP for Credit Card Payment...");
        return true;
    }
}
