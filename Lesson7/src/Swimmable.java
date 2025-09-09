public interface Swimmable {
    void drive();
    void swim();
    void surface();

    default void  checkWaterTemperature(){
        System.out.println("Water temperature is suitable for swimming.");
    }
}
