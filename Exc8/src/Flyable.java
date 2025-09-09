//Dusit Phaisan 67040233115
public interface Flyable {
    double MAX_ALTITUDE = 10000.0;
    String FLIGHT_MODE = "FLYING";

    void takeoff();
    void fly();
    void land();

    default void checkWeather(){
        //Dusit Phaisan 67040233115
        System.out.println("Checking weather condition....");
    }
}
