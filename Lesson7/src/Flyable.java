public interface Flyable {
    double MAX_ALTITUDE = 10000.0;
    String FIGHT_MODE = "FLYING";

    void takeoff();
    void fly();
    void land();

    default void checkWeather(){
        System.out.println("Chacking weather condition.....");
    }
}
