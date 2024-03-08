public class RightTriangle extends Triangle {
    public RightTriangle(String name, double base, double height, double hypotenuse){
        side1 = base;
        side2 = height;
        side3 = hypotenuse;

        setName(name);
        calculateAreaPyth();
        calculatePerimeter();
    }
}
