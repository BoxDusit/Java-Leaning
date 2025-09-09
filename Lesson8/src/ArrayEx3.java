import java.util.Scanner;
public class ArrayEx3 {
    public static void main(String[] args) {
        Employee Emp[][] = new Employee[2][2];

        String id,name;
        int age;
        double salary;
        Scanner input = new Scanner(System.in);

        for (int i=0; i<Emp.length;i++){
            System.out.println("Enter employee group no."+(i+1)+"data.....");
            for (int j=0 ; j<Emp[i].length;j++){
                System.out.print("Enter employee id    ==> ");
                id = input.next();
                System.out.print("Enter employee name  ==> ");
                name = input.next();
                System.out.print("Enter employee age   ==> ");
                age = input.nextInt();
                System.out.print("Enter employee salary==>");
                salary = input.nextDouble();
                System.out.println("---------------------------------");
                Emp[i][j] = new Employee(id,name,age,salary);

            }

        }
    }
}
