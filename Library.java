package CodeClause;

public class Library {
    private Book[] books; 
    private int bookCount; 

    public Library() {
        books = new Book[50]; 
        bookCount = 0; 
    }

    public void addBook(Book book) {
        if (bookCount < 50) { 
            books[bookCount] = book; 
            bookCount++; 
            System.out.println("Book added successfully.");
        } else {
            System.out.println("No space to add more books.");
        }
    }

    public void increaseBookQty(int serialNo, int qty) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getSerialNo() == serialNo) { 
                books[i].increaseQty(qty); 
                System.out.println("Book quantity increased successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchBookBySerialNo(int serialNo) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getSerialNo() == serialNo) { 
                System.out.println(books[i]); 
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchBookByAuthorName(String authorName) {
        boolean found = false; 
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthorName().equalsIgnoreCase(authorName)) { 
                System.out.println(books[i]); 
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found for author: " + authorName);
        }
    }

    public void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]); 
        }
    }
}