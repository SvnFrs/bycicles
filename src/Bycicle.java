public class Bycicle {
    private float price;
    private String name;

    public Bycicle() {}

    public Bycicle(String name, float price ) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
