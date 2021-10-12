public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto();
        Auto truck = new Truck();
        Auto car = new Car();
        auto.drive();
        car.drive();
        truck.drive();
        auto.transport();
        car.transport();
        truck.transport();
    }
}
