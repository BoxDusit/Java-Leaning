/*
Student ID   : 67040233116
Student Name : Suteerapat Kansomprot
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter unit price of product ==> ");
            double unitPrice = readDouble(sc);

            System.out.print("Enter the purchase quantity ==> ");
            int qty = readInt(sc);

            double sum = unitPrice * qty;
            System.out.printf("Sum price = %.1f%n", sum);
            System.out.println("----------------------------------------");

            System.out.println("Payment method");
            System.out.println("1 : Credit card");
            System.out.println("2 : Prompt Pay");

            int method = 0;
            while (true) {
                System.out.print("Enter payment method(1/2) ==> ");
                method = readInt(sc);
                if (method == 1 || method == 2) break;
                System.out.println("+++ Invalid payment method!!! +++");
                System.out.println("----------------------------------------");
            }

            Payment payment;
            if (method == 1) {
                System.out.print("Enter credit card number ==> ");
                String card = readLineNonEmpty(sc);
                System.out.println("********************************************");
                payment = new CreditCardPayment(sum, card);
            } else {
                System.out.print("Enter phone number ==> ");
                String phone = readLineNonEmpty(sc);
                System.out.println("********************************************");
                payment = new PromptPayPayment(sum, phone);
            }

            payment.processPayment();
            System.out.println("********************************************");
            System.out.println();

            System.out.print("Purchase new(Y/N)? ==> ");
            String again = readLineNonEmpty(sc);
            if (!again.equalsIgnoreCase("Y")) {
                break;
            }
        }
        sc.close();
    }

    private static double readDouble(Scanner sc) {
        while (true) {
            if (sc.hasNextDouble()) {
                double v = sc.nextDouble();
                sc.nextLine();
                return v;
            } else {
                sc.nextLine();
                System.out.print("Please enter a number ==> ");
            }
        }
    }

    private static int readInt(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int v = sc.nextInt();
                sc.nextLine();
                return v;
            } else {
                sc.nextLine();
                System.out.print("Please enter an integer ==> ");
            }
        }
    }

    private static String readLineNonEmpty(Scanner sc) {
        String s = sc.nextLine();
        while (s.trim().isEmpty()) {
            s = sc.nextLine();
        }
        return s.trim();
    }
}
