package Solution;

public class useBook
{
    public static void main(String[] args)
    {
        // Instantiate two TextBook objects with yearPrescribed as a String
        TextBook book1 = new TextBook(
                "N.O. Body", 
                "Introduction to Programming", 
                "Education", 
                "DISD1"
        );
        book1.setPrice(59.99); // Set price for the first textbook

        TextBook book2 = new TextBook(
                "S.O. Melody", 
                "Web Development Intermediate", 
                "Education", 
                "DISD2"
        );
        book2.setPrice(79.99); // Set price for the second textbook

        // Display details of each textbook
        System.out.println(book1.DisplayDetails());
        System.out.println(); // Blank line for separation
        System.out.println(book2.DisplayDetails());
    }
}
