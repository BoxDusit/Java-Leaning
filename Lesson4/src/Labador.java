public class Labador extends  Dog {
    String color;
    public Labador(){}

    public  Labador(String name ,int age ,String breed,String color){
        super (name,age,breed);
        this.color = color;
        System.out.println("Labador createed : " + name + "(" + color +")");

    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Color : "+color);
    }

}
