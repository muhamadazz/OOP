package shapes;

public class SameFoot extends Triangle {
    private double side;
    private double base;

    public SameFoot(double side, double base) {
        this.side = side;
        this.base = base;
    }

    @Override
    public double getPerimeter() {
        return 2 * side + base;
    }

    @Override
    public double getArea() {
        return 0.5 * base * Math.sqrt(side * side - 0.25 * base * base);
    }

    @Override
    public double getHypotenuse() {
        return -1; // Not applicable
    }
}
