package geometry;

import shapes.*;

public class Prism implements Geometry {
    private double baseWidth;
    private double baseHeight;
    private double height;

    public Prism(double baseWidth, double baseHeight, double height) {
        this.baseWidth = baseWidth;
        this.baseHeight = baseHeight;
        this.height = height;
    }

    @Override
    public double getBaseArea() {
        return new RightTriangle(baseWidth, baseHeight).getArea();
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }
}
