public class SameFoot extends Triangle {

    private Double base;
    private Double leg;

    public SameFoot(String name, Double base, Double leg) {
        super();
        this.name = name;
        this.base = base;
        this.leg = leg;
        this.calculateArea();
        super.side1 = base;
        super.side2 = leg;
        super.side3 = leg;
    }

    
    public void calculateArea() {
        double height = Math.sqrt((leg * leg) - Math.pow((base/2), 2));
        super.area = (base*height) / 2;
    }

    @Override
    public void getInfo() {
        System.out.println("\nSameFoot " + name + " info");
        System.out.println("Area: " + super.area);
        System.out.println("Base: " + base);
        System.out.println("leg: " + leg);
    }
}