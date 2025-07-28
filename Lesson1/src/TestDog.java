public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Minho");
        Dog dog3 = new Dog("Soda","Shiwawa",20);

        dog1.showDogInfo();
        System.out.println("-------------------------");
        dog2.showDogInfo();
        System.out.println("-------------------------");
        dog3.showDogInfo();
        System.out.println("-------------------------");
    }
}
