public class Animal {
    public void makeSound(){
        System.out.print("The animal make a sound ");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Bok Bok");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meaw Meaw");
    }
}

//class TestAnimal{
//    public static void main(String[] args) {
//        Animal pet = new Animal();
//
//
////        Dog dog = new Dog();
////        dog.makeSound();
////
////        Cat cat = new Cat();
////        cat.makeSound();
//
//        Animal myDog = new Dog();
//        Animal myCat = new Cat();
//
//        myDog.makeSound();
//
//    }
//}
