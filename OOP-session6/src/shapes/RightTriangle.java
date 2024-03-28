package shapes;

public class RightTriangle extends Triangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return base + height + getHypotenuse();
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getHypotenuse() {
        return Math.sqrt(base * base + height * height);
    }
}
