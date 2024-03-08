public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;


   
    public void calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        area =  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void calculateAreaPyth() {
        area =  (side1 * side2)/2;
    }



    public void calculatePerimeter() {
        perimeter =  side1 + side2 + side3;
    }
}
