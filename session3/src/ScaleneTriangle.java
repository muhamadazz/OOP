public class ScaleneTriangle extends Triangle{
    public ScaleneTriangle (String name, double a, double b, double c){
        side1 = a;
        side2 = b;
        side3 = c;

        setName(name);
        calculateArea();
        calculatePerimeter();
    }
}
