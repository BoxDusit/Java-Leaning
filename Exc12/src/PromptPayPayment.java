//67040233115 Dusit Phaisan
public class PromptPayPayment extends Payment implements Verifiable {
    private String phoneNumber;

    public PromptPayPayment(double amount, String phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    protected boolean validate() {
        System.out.println("Validating PromptPay number : " + phoneNumber);
        return phoneNumber != null && phoneNumber.length() == 10;
    }

    @Override
    protected boolean pay() {
        return verify();
    }

    @Override
    public boolean verify() {
        System.out.println("Verifying phone number with OTP...");
        return true;
    }
}
