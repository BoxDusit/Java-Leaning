import java.awt.geom.Area;
import java.util.Random;
import java.util.Scanner;
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String state = "Y";

        while (state.equals("Y")) {
            System.out.println("+++ Shape Menu +++");
            System.out.println("  1 : Circle");
            System.out.println("  2 : Square");
            System.out.println("  3 : Rectangle");
            System.out.println("  4 : Exit program.");
            System.out.println("++++++++++++++++++\n");

            int choice = 0;

            // รับค่าจนกว่าจะเป็น 1–4
            while (choice < 1 || choice > 4) {
                System.out.print("Enter menu ==> ");
                choice = scanner.nextInt();

                if (choice < 1 || choice > 4) {
                    System.out.println("*** Invalid menu choice!!!");
                    System.out.println("---------------------------");
                }
            }

            if (choice == 1) {
                System.out.print("Enter radius ==> ");
                double r = scanner.nextDouble();
                Circle circle = new Circle(r);
                System.out.println("Circle area : " + circle.getArea());
            }
            else if (choice == 2) {
                System.out.print("Enter length ==> ");
                double l = scanner.nextDouble();
                Square square = new Square(l);
                System.out.println("Square area : " + square.getArea());
            }
            else if (choice == 3) {
                System.out.print("Enter length ==> ");
                double l = scanner.nextDouble();
                System.out.print("Enter width ==> ");
                double w = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(l, w);
                System.out.println("Rectangle area : " + rectangle.getArea());
            }
            else if (choice == 4) {
                System.out.println("**** Program terminated ****");
                break;
            }

            System.out.println("---------------------------");
            System.out.print("Start new?(Y/N) ==> ");
            state = scanner.next();
        }

    }
}
