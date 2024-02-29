public class Square {
    // Declare private properties
    private double width;
    private double height;
  
    // Constructor to initialize width and height
    public Square(double width, double height) {
      this.width = width;
      this.height = height;
    }
  
    // Setter for width
    public void setWidth(double width) {
      this.width = width;
    }
  
    // Setter for height
    public void setHeight(double height) {
      this.height = height;
    }
  
    // Getter for area (Luas)
    public double getLuas() {
      return width * height;
    }
  
    // Getter for perimeter
    public double getPerimeter() {
      return 2 * (width + height);
    }
  }
  
