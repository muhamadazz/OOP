public class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius){
        setName(name);
        this.radius =  radius;
        calculatePerimeter(radius);
        calculateArea(radius);
    }

    public void calculatePerimeter(double radius){
        super.perimeter = 2 * Math.PI * radius;
    }

    public void calculateArea(double radius){
        super.area = Math.PI * Math.pow(radius, 2);
    }
}
