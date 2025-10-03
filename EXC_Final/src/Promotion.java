public class Promotion {
    private String code;
    private String proName;
    private int freeCallMinutes;
    private int freeInternetGB;
    private double monthlyFree;

    public Promotion(String code,String proName,int freeCallMinutes,int freeInternetGB,double monthlyFree){
        this.code=code;
        this.proName=proName;
        this.freeCallMinutes=freeCallMinutes;
        this.freeInternetGB=freeInternetGB;
        this.monthlyFree=monthlyFree;
    }

    public Promotion() {
    }

    public String getCode() {
        return code;
    }

    public String getProName() {
        return proName;
    }

    public int getFreeCallMinutes() {
        return freeCallMinutes;
    }

    public int getFreeInternetGB() {
        return freeInternetGB;
    }

    public double getMonthlyFree() {
        return monthlyFree;
    }

    //ไม่สมบูรณ์
    public static boolean isValidCode(String code){
        switch (code.toUpperCase()){
            case "AA":return true;
            case "BB":return true;
            case "CC":return true;
            case "DD":return true;
            default:return false;
        }

    }

    public static Promotion getPromotion(String code){
        switch (code.toUpperCase()) {
            case "AA":
                return new Promotion("AA","5G MAX Talk",800,40,890.0);
            case "BB":
                return new Promotion("BB","5G MAX Professional",1200,100,1200.0);
            case "CC":
                return new Promotion("CC","Max Value",500,25,690.0);
            case "DD":
                return new Promotion("DD","Save Value",200,10,390.0);
            default:
                return null;
        }
    }

    public void showPromotionInfo(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %18s %15s %15s\n","Code","Promotion","Call(min.)","Internet(GB)","Monthly(baht)");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %18s %15s %15s\n",code,proName,freeCallMinutes,freeInternetGB,monthlyFree);
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void showAllPromotionList(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %18s %15s %15s\n","Code","Promotion","Call(min.)","Internet(GB)","Monthly(baht)");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %18s %15d %15.2f\n","AA","5G MAX Talk",800,40,890.0);
        System.out.printf("%-10s %-10s %10d %15d %15.2f\n","BB","5G MAX Professional",1200,100,1200.0);
        System.out.printf("%-10s %-10s %19d %15d %15.2f\n","CC","Max Value",500,25,690.0);
        System.out.printf("%-10s %-10s %19d %15d %15.2f\n","DD","Save Value",200,10,390.0);
        System.out.println("-----------------------------------------------------------------------------");
    }
}

