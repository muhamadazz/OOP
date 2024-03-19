public class RightTriangle extends Triangle {
    private double base;
    private double height;

    public RightTriangle(String name, double base, double height){
        super();
        this.name = name;
        this.base = base;
        this.height = height;
        this.calculateArea();
        super.side1 = base;
        super.side2 = height;
        super.side3 = this.getHypotenuse();
    }

    public double getHypotenuse(){
        return Math.sqrt((base*base)+ (height*height));
    }

    public void calculateArea(){
        super.area = (base*height)/2;
    }

    public void getInfo(){
        System.out.print("RightTriangle "+name+" info");
        System.out.print(" area:  "+super.area);
        System.out.print(" with base: "+base);
        System.out.print(" and height: "+height);
        System.out.print(" and hypotenuse: "+this.getHypotenuse());
        System.out.println();
    }
    

}
