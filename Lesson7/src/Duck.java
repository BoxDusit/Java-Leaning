import javax.xml.namespace.QName;

public class Duck implements Flyable,Swimmable{

    private String name;
    public Duck(String name){
        this.name=name;
    }

    @Override
    public void takeoff() {
        System.out.println(name+"flaps wing and takes off.");
    }

    @Override
    public void fly() {
        System.out.println(name+"flies gracefully in the sky.");
    }

    @Override
    public void land() {
        System.out.println(name+"flies gracefully in the sky."); //??????
    }

    @Override
    public void drive() {
        System.out.println(name+"drives under ."); //??????
    }

    @Override
    public void swim() {
        System.out.println(name+"swims on the water surface.");
    }

    @Override
    public void surface() {
        System.out.println(name+"surfaces from underwater");
    }
}
