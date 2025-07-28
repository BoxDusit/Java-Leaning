public class Cat extends Animal{

    String color;

    public Cat(){}

    public Cat(String name,int age,String color){
        super (name, age);
        this.color = color;
    }

    public void meow(){
        System.out.println("+++ meow meow ++++");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Color : "+color);
    }

}
