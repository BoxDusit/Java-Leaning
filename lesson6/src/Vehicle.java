public class Vehicle {
    public void drive(){
        System.out.println("The vehicle is driving.");
    }
}

class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("The Car is driving on the road.");
    }
}

class Motorcycle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("The motorcycle is driving on the road.");
    }
}

class TestVehicle{

    public static void startEngine(Vehicle v){
        System.out.println(v);
        v.drive();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle c1 = new Car();
        Vehicle m1 = new Vehicle();

        startEngine(v1);
        startEngine(c1);
        startEngine(m1);
    }
}
