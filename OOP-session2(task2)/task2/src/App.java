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

        // Create instances of books
        Books book1 = new Books("Author 1", "Title 1", 25.0, 1234);
        Books book2 = new Books("Author 2", "Title 2", 30.0, 5678);

        //Calculate the number of purchases of each book
        int quantityBook1 = 2;
        int quantityBook2 = 1;

        double totalPrice = book1.calculateTotalPrice(quantityBook1) + book2.calculateTotalPrice(quantityBook2);

        System.out.println("Total book purchase price: $" + totalPrice);


    }
}