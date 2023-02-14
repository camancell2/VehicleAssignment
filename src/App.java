public class App {
    public static void main(String[] args) throws Exception {
        Car hatchback = new Car();
        Car sedan = new Car();

        hatchback.setMake("Kia");
        hatchback.setModel("Rio");

        sedan.setMake("Nissan");
        sedan.setModel("Versa");

        // Tests
        hatchback.accelerate();
        hatchback.brake();
        hatchback.handbrake();

        sedan.accelerate();
        sedan.brake();
        sedan.handbrake();
    }
}
