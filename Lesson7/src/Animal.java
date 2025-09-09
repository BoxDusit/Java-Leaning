public abstract class Animal {
    protected  String name;
    protected int age;

    //Comstuctor
    public Animal (String name,int age){
        this.name=name;
        this.age=age;
    }

    //Abtract method
    public  abstract void  makeSound();
    public  abstract void move();

    //Concrete method
    public void sleep(){
        System.out.println("Zzzzzzzz....");
    }

    public void displayInfo(){
        System.out.printf(String.format("Name : %s\nAge : %d",name,age));
    }

}

class Dog extends Animal{
    private String breed;

    public Dog(String name, int age ,String breed){
        super(name,age);
        this.breed=breed;
    }




    @Override
    public void makeSound() {
        System.out.println(name + "brak : Bok! Bok!.");
    }

    @Override
    public void move() {
        System.out.println(name + "runs on four legs.");
    }

    public void wag() {
        System.out.println(name + "wags tail happily.");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("breed : "+breed);
    }
}

class Bird extends Animal{
    private double wingspan;

    public Bird(String name , int age,double wingspan){
        super(name,age);
        this.wingspan=wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println(name + "brak : jib! jib!.");
    }

    @Override
    public void move() {
        System.out.println(name + "fly on two legs.");
    }
}
