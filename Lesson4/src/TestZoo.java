public class TestZoo {
    public static void main(String[] args) {
        Animal  myAnimal = new Animal("Generic Animal",5);
        Dog myDog = new Dog("Soba",3,"shin Tzu");
        System.out.println("---------------------------");
        myAnimal.displayInfo();
        myDog.displayInfo();

        myDog.bark();
        myDog.wagingTail();
        System.out.println("---------------------------");
        Labador myLabadoor = new Labador("Lucky",4,"Labador","Black");
        myLabadoor.displayInfo();

        System.out.println("---------------------------");
        Cat myCat = new Cat("Tom",4,"orange");
        myCat.displayInfo();

    }
}
