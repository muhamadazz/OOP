public class Books {
    private String author;
    private String title;
    private double price;
    private String publisherNumber;
  
    // Constructor
    public Books(String author, String title, double price, String publisherNumber) {
      this.author = author;
      this.title = title;
      this.price = price;
      this.publisherNumber = publisherNumber;
    }
  
    // Getters
    public String getAuthor() {
      return author;
    }
  
    public String getTitle() {
      return title;
    }
  
    public double getPrice() {
      return price;
    }
  
    public String getPublisherNumber() {
      return publisherNumber;
    }
  
    // Setters (optional, depending on your needs)
    public void setAuthor(String author) {
      this.author = author;
    }
  
    public void setTitle(String title) {
      this.title = title;
    }
  
    public void setPrice(double price) {
      this.price = price;
    }
  
    public void setPublisherNumber(String publisherNumber) {
      this.publisherNumber = publisherNumber;
    }
  }
  
