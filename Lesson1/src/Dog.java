public class Dog {
    //Attribute
    private String name;
    private String breed;
    private int age;
    private  static  int dogCount=0;//ตัวเเปรของคลาส

    //constructor
    public Dog(){
        name = "Unknown";
        breed = "Unknown";
        age = 0;
        dogCount++;
    }

    //constructor Overloading
    public Dog( String name,String breed,int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
        dogCount++;
    }

    public Dog( String name){
        this.name = name;
        breed = "Unknow";
        age = 0;
        dogCount++;
    }

    //method
    static void showNumberOfDog(){
        System.out.println(("Number of all dog"+dogCount));
    }
    void showDogInfo(){
        System.out.println("Name : " + name + "\nBreed : " + breed + "\nAge : " + age);
    }
    void bark(){
        System.out.println("Bok Bok!!!");
    }

    //get/set method
    //method กำหนดค่าให้ attribute name
    public void setName(String name ){
        this.name = name;
    }
    public void setBreed(String breed ){
        this.breed = breed;
    }
    public void setAge(int age ){
        this.age = age;
    }

    //method อ่านค่าจาก attribute name
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
}

