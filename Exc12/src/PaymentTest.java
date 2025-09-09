//67040233115 Dusit Phaisan
import java.util.Scanner;

public class PaymentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter unit price of product ==> ");
            double unitPrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the purchase quantity ==> ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            double totalPrice = unitPrice * quantity;
            System.out.printf("Sum price = %.1f%n", totalPrice);
            System.out.println("----------------------------------------");

            System.out.println("Payment method");
            System.out.println("1 : Credit card");
            System.out.println("2 : Prompt Pay");

            int paymentMethod = 0;
            while (true) {
                System.out.print("Enter payment method(1/2) ==> ");
                paymentMethod = scanner.nextInt();
                scanner.nextLine();
                if (paymentMethod == 1 || paymentMethod == 2) break;
                System.out.println("+++ Invalid payment method!!! +++");
                System.out.println("----------------------------------------");
            }

            Payment payment;
            if (paymentMethod == 1) { // Credit card
                System.out.print("Enter credit card number ==> ");
                String cardNumber = scanner.nextLine();
                System.out.println("********************************************");
                payment = new CreditCardPayment(totalPrice, cardNumber);
            } else { // Prompt Pay
                System.out.print("Enter phone number ==> ");
                String phoneNumber = scanner.nextLine();
                System.out.println("********************************************");
                payment = new PromptPayPayment(totalPrice, phoneNumber);
            }

            payment.processPayment();
            System.out.println("********************************************");
            System.out.println();

            System.out.print("Purchase new(Y/N)? ==> ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }
}

