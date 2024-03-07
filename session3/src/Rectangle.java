public class Rectangle extends Shape{
    public Rectangle(String name, double width,double height ){
        setName(name);
        calculatePerimeter(width, height);
        calculateArea(width, height);
    }

    public void calculatePerimeter(double width, double height){
        perimeter = 2 * (width + height);
    }

    public void calculateArea(double width, double height){
        area = width * height;
    }
}
