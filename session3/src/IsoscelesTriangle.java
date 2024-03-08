public class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(String name, double base, double leg){
        side1 = base;
        side2 = leg;
        side3 = leg;

        setName(name);
        calculateArea();
        calculatePerimeter();

    }
}
