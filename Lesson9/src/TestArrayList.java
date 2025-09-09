import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(); //ไม่ต้องระบุจำนวนช่อง
        ArrayList<Double> gpa = new ArrayList<Double>();

        String[] stdName = new String[5]; //ต้องกำหนดจำนวนช่องเสมอ

        names.add("rewadee");
        names.add("Khawchai");
        names.add("Wannasiri");
        names.add("Wilaiporn");

        gpa.add(3.75);
        gpa.add(4.335);

        System.out.println("names : "+ names.get(1));
        System.out.println("gpq : "+gpa.get(1));

        names.add(1,"Khunawut"); //จะนำ "Khunawut" ไปเพิ่มในตำเเหน่งที่หนึ่งเเละดันตัวอื่นไปตำเเหน่งต่อไป

        names.set(1,"Khunanon"); //จะนำ "Khunanon" ไปเเทนที่่ตำเเหน่งที่1/กำหนดค่าให้กับช่องที่1

        names.get(0);//อ่านค่าช่องที่1

        names.remove(1);//ลบค่าตำเเหน่งที่1เเละนำตัวอื่นดันมาข้างหน้า
        names.remove("rewadee");

        //วนลูปเเสดงข้อมูลใน arraylist #1
        for (int i=0;i<names.size();i++){
            System.out.printf("names[%d] : %s\n",i,names.get(i));
        }

        //วนลูปเเสดงข้อมูลใน arraylist #2
        int i=0;
        for (String n :names){
            System.out.printf("names[%d] : %s\n",i,n);
            i++;
        }

    }
}
