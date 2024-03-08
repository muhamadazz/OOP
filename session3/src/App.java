public class App {
    public static void main(String[] args) throws Exception {
        Circle circleABC = new Circle("circle ABC", 7.0);
        circleABC.getInfo();

        ScaleneTriangle triangle1 = new ScaleneTriangle("segitiga sembarang", 6, 8, 10);
        triangle1.getInfo();

        RightTriangle triangle2 = new RightTriangle("segitiga siku siku", 5, 7, 8);
        triangle2.getInfo();

        EquilateralTriangle triangle3 = new EquilateralTriangle("segitiga sama sisi", 6);
        triangle3.getInfo();

        IsoscelesTriangle triangle4 = new IsoscelesTriangle("segitiga sama kaki", 5, 10);
        triangle4.getInfo();
    }
}
