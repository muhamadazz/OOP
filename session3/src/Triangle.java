public class Triangle extends Shape {
    protected double height;
    protected double base;

    public Triangle(String name, double a, double b, double c , double base, double height){
        setName(name);
        calculatePerimeter(a,b,c);
        calculateArea(base, height);
    }

    public void calculatePerimeter(double a, double b, double c){
        perimeter = a + b + c;
    }
    
    public void calculateArea(){
        area = 1/2 * base * height;
    }
}
