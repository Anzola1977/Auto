public class Truck extends Auto {

    public Truck() {
        super("KAMAZ", "red", false, 20000);
    }

    @Override
    void drive() {
        super.drive();
        System.out.println("Нас ждёт бездорожье!");
    }

    @Override
    void transport() {
        super.transport();
        System.out.println("В кузове места много!");
    }
}
