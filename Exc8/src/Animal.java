//Dusit Phaisan 67040233115
abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name , int age){
        this.name=name;
        this.age=age;
    }

    //Dusit Phaisan 67040233115
    public abstract void makeSound();
    public abstract void move();

    //Dusit Phaisan 67040233115
    public void sleep(){
        System.out.println("Zzzzzz....");
    }

    public void displayInfo(){
        System.out.println(String.format("Name : %s\nAge   : %d",name,age));
    }
}
