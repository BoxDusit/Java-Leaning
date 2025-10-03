import java.util.Scanner;
public class PhoneTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Mobile Phone Billing System ====");
        System.out.print("Enter Phone Number ==> ");
        String phoneNumber = input.nextLine();

        System.out.println("\n\t\t\t\t ***** ABC Mobile Promotion List *****\n");

        Promotion.showAllPromotionList();

        String code;
        int minuteUse;
        int internetUse;

        while (true) {
            System.out.print("Enter Promotion Code (AA/BB/CC/DD) ==> ");
            code = input.nextLine();
            if (Promotion.isValidCode(code)) {
                System.out.print("Enter Minutes Used ==> ");
                minuteUse = input.nextInt();
                System.out.print("Enter Internet Used (GB) ==> ");
                internetUse = input.nextInt();
                break;
            } else {
                System.out.println("*** Invalid promotion code. Try again! ***");
            }
        }
        System.out.println("+++++++++++ Billing Report +++++++++++");


        Promotion p1 = Promotion.getPromotion(code);
        PhoneUsage n1 = new PhoneUsage(phoneNumber, code, minuteUse, internetUse);

        n1.showPhoneUsageInfo();
        p1.showPromotionInfo();

        int callover = n1.getCallMinutes() - p1.getFreeCallMinutes();
        if (callover < 0) callover = 0;

        int internetover = n1.getInternetUsage() - p1.getFreeInternetGB();
        if (internetover < 0) internetover = 0;

        double callFee = callover * 1.0;
        double internetFee = internetover * 20.0;
        double total = p1.getMonthlyFree()+callFee + internetFee;
        double vat = total * 0.07;
        double net = total + vat;

        System.out.printf("Call over promotion fee                  :    %.2f bath. (%d minutes.)\n", callFee, callover);
        System.out.printf("Internet usage over promotion fee        :    %.2f bath. (%d GB.)\n\n", internetFee, internetover);
        System.out.printf("Total fee                                :    %.2f bath.\n", total);
        System.out.printf("VAT                                      :    %.2f bath.\n", vat);
        System.out.printf("Net fee                                  :    %.2f bath.\n", net);

        System.out.println("\n******** Thank you for using our services. ********");

    }}


