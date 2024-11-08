package Solution;

// Abstract class representing a generic book
public abstract class Book
{
    // Author of the book
    private final String author;

    // Title of the book
    private final String title;

    // Category of the book (e.g., fiction, non-fiction)
    private final String category;

    // Price of the book, abstract as it will be set in subclasses
    protected double price;

    /**
     * Constructor for Book class
     * @param author The author of the book
     * @param title The title of the book
     * @param category The category of the book
     */
    public Book(String author, String title, String category)
    {
        this.author = author;
        this.title = title;
        this.category = category;
    }

    // Abstract method to set the price of the book
    public abstract void setPrice(double price);

    // Getter for author
    public String getAuthor()
    {
        return author;
    }

    // Getter for title
    public String getTitle()
    {
        return title;
    }

    // Getter for category
    public String getCategory()
    {
        return category;
    }

    // Getter for price
    public double getPrice()
    {
        return price;
    }
}
