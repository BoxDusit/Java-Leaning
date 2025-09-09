import java.util.Scanner;
import java.sql.SQLException;
import java.io.IOException;
public class A_Class {
    public void go(int n) throws IOException, SQLException {
        switch (n){
            case 0 : System.out.println("????????????????????");
            case 1 : throw new IOException();
            case 2 : throw new SQLException();
            default: throw new IllegalArgumentException();
        }
    }
}

class ATester{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        A_Class a= new A_Class();
        System.out.print("Enter menu ==> ");
        int menu = input.nextInt();
        try{
            a.go(menu);
        }catch (IOException ex){
            System.out.println("Catch IOException");
        }catch (SQLException ex){
            System.out.println("Catch SQLException");
        }catch (IllegalArgumentException ex){
            System.out.println("Catch IllegalArgument Exception");
        }
    }
}
