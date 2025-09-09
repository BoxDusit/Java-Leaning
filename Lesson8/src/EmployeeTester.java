import java.lang.reflect.Array;
import java.util.Arrays;


public class EmployeeTester {
    public static void main(String[] args) {
        Employee[] Emp = new Employee [3];

        Emp[0] = new Employee("E01","Wanida",25,25000.0);
        Emp[1] = new Employee();
        Emp[2] = new Employee("E03","pongsuk");


        for(int i=0;i<Emp.length;i++){
            Emp[i].showEmployeeInfo();

        }

        int[] score = {69,75,35,80,45};
//        for (int sc:score){
//            System.out.println(sc);
//        }
        
        
        //Before sort
        System.out.println("------Before sort------");
        for (int i = 0; i<score.length; i++){
            System.out.print("score["+1+"] : "+score[i]);
        }

        System.out.println();
        Arrays.sort(score);
        System.out.println("------After sort------");
        for (int i = 0; i<score.length; i++){
            System.out.print("score["+1+"] : "+score[i]+"  ");
        }

        System.out.println("-----------------------");
        int index = Arrays.binarySearch(score,80);
        if (index>=0){
            System.out.println("Found element at index : "+index);
        }else{
            System.out.println("Element not found!!!");
        }
        System.out.println("index = "+index);


    }
}
