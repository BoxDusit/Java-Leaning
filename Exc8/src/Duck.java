//Dusit Phaisan 67040233115
public class Duck extends Animal implements Swimmable,Flyable{
    public Duck(String name , int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " quacks: Gabb! Gabb!");
    }

    @Override
    public void move() {
        System.out.println(name + " move by walking or floating");
    }


    @Override
    public void takeoff() {
        System.out.println(name + " flaps wings and takes off.");
    }

    @Override
    public void fly() {
        System.out.println(name + " files gracefully in the sky.");
    }

    @Override
    public void land() {
        System.out.println(name + " lands gently on water or ground.");
    }

    //Dusit Phaisan 67040233115
    @Override
    public void drive() {
        System.out.println(name + " drives underwater to find food.");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims on the water surface.");
    }

    @Override
    public void surface() {
        System.out.println(name + " surfaces from underwater.");
    }
}
