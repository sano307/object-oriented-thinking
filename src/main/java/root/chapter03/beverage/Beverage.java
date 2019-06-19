package root.chapter03.beverage;

public abstract class Beverage {

    protected String description;
    private Size size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Beverage setSize(Size size) {
        this.size = size;
        return this;
    }

    protected Size getSize() {
        return size;
    }
}
