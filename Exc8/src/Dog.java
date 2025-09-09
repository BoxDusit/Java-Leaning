//Dusit Phaisan 67040233115
public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Bok! Bok!");
    }

    @Override
    public void move() {
        System.out.println(name + " runs on four legs");
    }

    public void wagTail() {
        System.out.println(name + " wags tail happily");
    }
}