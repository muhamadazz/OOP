public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(String name, Double height, Double width) {
        super();
        this.name = name;
        this.height = height;
        this.width = width;
        this.calculateArea();
    }

    public void calculateArea() {
        super.area = height * width;
    }

    @Override
    public void getInfo() {
        System.out.println("\nRectangle " + name + " info");
        System.out.println("Area: " + super.area);
        System.out.println("height: " + height);
        System.out.println("Width: " + width);
    }
}
