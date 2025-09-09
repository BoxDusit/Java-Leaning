public class InterfaceTest {
    public static void main(String[] args) {
        Airplane boieg = new Airplane("Boieng 737",180);
        Duck prallow = new Duck("PedPrallow");

        System.out.println("+++++++ Airplane +++++++");
        boieg.checkWeather();
        boieg.takeoff();
        boieg.fly();
        boieg.boardPassenger();


        System.out.println("+++++++ Prallow +++++++");
        prallow.checkWeather();
        prallow.fly();
        prallow.drive();
        prallow.takeoff();
        prallow.land();
        prallow.swim();
        prallow.checkWaterTemperature();


        
    }
}
