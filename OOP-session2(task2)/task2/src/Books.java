public class Books {
    private String author;
    private String title;
    private double price;
    private int publisherNumber;

    public Books(String author, String title, double price, int publisherNumber) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisherNumber = publisherNumber;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotalPrice(int quantity) {
        return price * quantity;
    }
}