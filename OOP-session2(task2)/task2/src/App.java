public class App {
    public static void main(String[] args) {
      // Create a Square object with a width and height of 5 units
      Square square = new Square(5, 5);
  
      // Display the area of the square
      System.out.println("Area of the square: " + square.getLuas());
  
      // Display the perimeter of the square
      System.out.println("Perimeter of the square: " + square.getPerimeter());
  
      // Change the width and height of the square
      square.setWidth(10);
      square.setHeight(10);
  
      // Display the new area and perimeter of the square
      System.out.println("New area of the square: " + square.getLuas());
      System.out.println("New perimeter of the square: " + square.getPerimeter());
      System.out.println("==============================");

      // Creating an instance of the Books class
    Books book1 = new Books("John Doe", "The Great Adventure", 19.99, "123456789");

    // Accessing the attributes of the book1 instance
    System.out.println(book1.getAuthor()); // Output: John Doe
    System.out.println(book1.getTitle()); // Output: The Great Adventure
    System.out.println(book1.getPrice()); // Output: 19.99
    System.out.println(book1.getPublisherNumber()); // Output: 123456789
    
    }
}