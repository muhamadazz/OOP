public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle (String name, double side){
        side1 = side;
        side2 = side;
        side3 = side;

        setName(name);
        calculateArea();
        calculatePerimeter();

    }
    
}
