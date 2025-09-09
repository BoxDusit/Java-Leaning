//Dusit Phaisan 67040233115
public interface Swimmable {
    void drive();
    void swim();
    void surface();

    default void checkWaterTemperature(){
        //Dusit Phaisan 67040233115
        System.out.println("Water Temperature is suitable for swimming");
    }
}
