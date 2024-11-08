package Solution;

// TextBook class, a subclass of Book, implements the iPrintable interface
public class TextBook extends Book implements iPrintable
{
    // Year the textbook was prescribed, now stored as a string
    private final String yearPrescribed;

    /**
     * Constructor for TextBook class
     * @param author The author of the textbook
     * @param title The title of the textbook
     * @param category The category of the textbook
     * @param yearPrescribed The year the textbook was prescribed as a string
     */
    public TextBook(String author, String title, String category, String yearPrescribed)
    {
        super(author, title, category);
        this.yearPrescribed = yearPrescribed;
    }

    // Implemented method to set the price of the textbook
    @Override
    public void setPrice(double price)
    {
        this.price = price;
    }

    // Getter for yearPrescribed, now returning a string
    public String getYearPrescribed()
    {
        return yearPrescribed;
    }

    // Implemented method to display details of the textbook
    @Override
    public String DisplayDetails()
    {
        return "Author: " + getAuthor() +
               "\nTitle: " + getTitle() +
               "\nCategory: " + getCategory() +
               "\nPrice: R" + getPrice() +
               "\nYear Prescribed: " + yearPrescribed;
    }
}
