
public class PhoneUsage {
    private String phoneNumber;
    private String promotionCode;
    private int callMinutes;
    private int internetUsage;
    public PhoneUsage(String phoneNumber,String promotionCode,int callMinutes,int internetUsage){
        this.phoneNumber = phoneNumber;
        this.promotionCode = promotionCode;
        this.callMinutes = callMinutes;
        this.internetUsage = internetUsage;
    }

    public PhoneUsage() {

    }

    public String getPhoneNumber(String phoneNumber) {
        return this.phoneNumber;
    }

    public String getPromotionCode(String code) {
        return promotionCode;
    }

    public int getCallMinutes() {
        return callMinutes;
    }

    public int getInternetUsage() {
        return internetUsage;
    }
    public  void showPhoneUsageInfo(){
        System.out.println("Phone Number           : "+phoneNumber);
        System.out.println("Promotion Code         : "+promotionCode.toUpperCase());
        System.out.println("Minutes Used(minutes)  : "+callMinutes);
        System.out.println("Internet Used (GB)     : "+internetUsage);
    }
}
