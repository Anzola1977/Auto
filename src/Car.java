public class Car extends Auto {

    public Car() {
        super("Volga", "white", true, 2500);
    }

    @Override
    void drive() {
        super.drive();
        System.out.println("Выезжаем на скоростную трассу!");
    }

    @Override
    void transport() {
        super.transport();
        System.out.println("Садись на заднее сиденье!");
    }
}
