public class Auto {
    String brand, color;
    boolean isAWD;
    int weight;

    public Auto(String brand, String color, boolean isAWD, int weight) {
        this.brand = brand;
        this.color = color;
        this.isAWD = isAWD;
        this.weight = weight;
    }

    public Auto() {

    }

    void drive() {
        System.out.println("Поехали!");
    }

    void transport() {
        System.out.println("Давай подвезу!");
    }
}