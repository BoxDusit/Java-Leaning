//Dusit Phaisan 67040233115
 class Bird extends Animal implements Flyable {
    private double wingspan;

    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Jib! Jib!");
    }

    @Override
    public void move() {
        System.out.println(name + " flies with " + wingspan + " cm wingspan");
    }

    //Dusit Phaisan 67040233115
    @Override
    public void takeoff() {
        System.out.println(name + " flaps wings and takes off.");
    }

    @Override
    public void fly() {
        System.out.println(name + " files gracefully in the sky.");
    }

    @Override
    public void land() {
        System.out.println(name + " lands gently on water or ground.");
    }
}
