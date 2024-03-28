package geometry;

import shapes.Square;

public class Cube implements Geometry {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getBaseArea() {
        return new Square(side).getArea();
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}
