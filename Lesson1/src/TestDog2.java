import java.util.Scanner;

public class TestDog2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Dog d1 = new Dog();

        System.out.print("Enter dog name ==> ");
        //d1.name = input.next();  error
        d1.setName(input.next());

        System.out.print("Enter dog breed ==> ");
        //d1.breed = input.next();  error
        d1.setBreed(input.next());

        System.out.print("Enter dog age ==> ");
        //d1.age = input.next();  error
        d1.setAge(input.nextInt());

        d1.showDogInfo();

    }
}
