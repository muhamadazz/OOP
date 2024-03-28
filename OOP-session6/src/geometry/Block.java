package geometry;

import shapes.Rectangle;

public class Block implements Geometry{
    private double width;
    private double height;
    private double depth;

    public Block(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getBaseArea() {
        return new Rectangle(width, depth).getArea();
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }
}
