//Dusit Phaisan 67040233115
public class AnimalTest {
    public static void main(String[] args) {
        //Dusit Phaisan 67040233115
        System.out.println("++++++ Dog ++++++");
        Dog dog = new Dog("Soba", 5,"Shin Tzu");
        dog.displayInfo();
        dog.makeSound();
        dog.move();
        dog.sleep();
        dog.wagTail();

        //Dusit Phaisan 67040233115
        System.out.println();
        System.out.println("++++++ Bird ++++++");
        Bird bird = new Bird("Twenty",2,15.0);
        bird.displayInfo();
        bird.makeSound();
        bird.move();
        bird.sleep();
        bird.takeoff();
        bird.fly();
        bird.land();

        //Dusit Phaisan 67040233115
        System.out.println();
        System.out.println("++++++ Duck ++++++");
        Duck duck = new Duck("Mallard",2);
        duck.displayInfo();
        duck.sleep();
        duck.takeoff();
        duck.fly();
        duck.land();
        duck.drive();
        duck.swim();
        duck.surface();

        //Dusit Phaisan 67040233115
        System.out.println("==========================================\n");
        System.out.println("++++++ Polymorphism ++++++");
        dog.makeSound();
        dog.move();
        bird.makeSound();
        bird.move();
        duck.makeSound();
        duck.move();



    }
}
