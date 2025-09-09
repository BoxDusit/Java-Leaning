public class Airplane implements Flyable{

    private String model;
    private int passengerCapacity;

    public Airplane(String model,int passengerCapacity){
        this.model=model;
        this.passengerCapacity=passengerCapacity;
    }

    @Override
    public void takeoff() {
        System.out.println(model+"is Taking off from runway.");
    }

    @Override
    public void fly() {
        System.out.println(model+"is flying at altitude up to "+MAX_ALTITUDE+"feet.");
    }

    @Override
    public void land() {
    System.out.println(model+"is Landing safety.");
    }

    public void boardPassenger(){

    }
}
