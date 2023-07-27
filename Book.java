package CodeClause;

public class Book {
    private int serialNo;
    private String bookName;
    private String authorName;
    private int availableQty;
    private int totalQty;

    public Book(int serialNo, String bookName, String authorName, int totalQty) {
        this.serialNo = serialNo; 
        this.bookName = bookName; 
        this.authorName = authorName; 
        this.availableQty = totalQty; 
        this.totalQty = totalQty; 
    }

    public int getSerialNo() {
        return serialNo; 
    }

    public String getBookName() {
        return bookName; 
    }

    public String getAuthorName() {
        return authorName; 
    }

    public int getAvailableQty() {
        return availableQty; 
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void increaseQty(int qty) {
        totalQty += qty; 
        availableQty += qty; 
    }

    public void decreaseQty(int qty) {
        availableQty -= qty; 
    }

    @Override
    public String toString() {
        return "Serial No: " + serialNo + ", Book Name: " + bookName + ", Author Name: " + authorName +
                ", Available Qty: " + availableQty + ", Total Qty: " + totalQty;
    }
}