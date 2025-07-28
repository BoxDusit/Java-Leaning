public class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Animal created : "+ name);
    }
    public Animal(){

    }

    public void  eat(){
        System.out.println(name + "  is eating.");
    }

    public void sleep(){
        System.out.println(name + "  is sleeping");
    }
    public void displayInfo(){
        System.out.println("Name : "  + name +"\nAge : " + age );
    }
}
