package shapes;

public class SameSide extends Triangle{
    private double side1;
    private double side2;
    private double angle;

    public SameSide(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side1 * Math.sin(angle);
    }

    @Override
    public double getArea() {
        return 0.5 * side1 * side2 * Math.sin(angle);
    }

    @Override
    public double getHypotenuse() {
        return -1; // Not applicable
    }
}
