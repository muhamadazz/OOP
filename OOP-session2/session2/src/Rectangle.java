public class Rectangle {
    private double base;
    private double height;
    private double area;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public void calculate(){
        this.area = this.base * this.height;
    }

    public double display(){
        calculate();
        return this.area;
    }
}
