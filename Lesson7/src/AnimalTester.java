public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("bot",4,"Golden Retriver");
        Bird bird = new Bird("sun",5,4.55);

        System.out.println("++++++++ Dog ++++++++");
        dog.displayInfo();
        dog.makeSound();
        dog.move();
        dog.sleep();

        System.out.println("++++++++ Bird ++++++++");
        bird.displayInfo();
        bird.makeSound();
        bird.sleep();

        System.out.println("++++++++ Plymorism ++++++++");
        Animal[] animals = {dog,bird};
        for (Animal animal:animals){
            animal.displayInfo();
            animal.makeSound();
            animal.move();
            animal.sleep();
        }
    }
}
