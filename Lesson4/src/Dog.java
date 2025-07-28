import javax.lang.model.element.Name;

public class Dog extends Animal{
    public static Dog myDog;
    String breed;

    public Dog(String name,int age,String breed){
        super(name, age);
        this.breed = breed;
        System.out.println("Dog created : "+this.name+"(" +this.breed+")");

    }

    public Dog (){
        System.out.println("Animal cannot created");
    }

    public void DisplayInfo() {
        super.displayInfo();
        System.out.println("Breed : " + breed);
    }

    public void  bark(){
        System.out.print("+++ Bok bok +++");
    }

    public  void wagingTail(){
        System.out.print("+++ is wagging  +++");
    }


}
