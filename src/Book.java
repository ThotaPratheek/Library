
/**
 * This class represents a book and has different functions that help to initialize and retrieve information.
 */


public class Book {
    private String title;
    private int bookID;
    private static int nextBookID = 1004825;
    private Genre genre;
    private int year;
    private String publisher;
    private int numPages;
    private String[] authorNames;



    /**
     * Private Constructor which creates a book.
     * @param title The title of the book.
     * @param genre The genre of the book.
     * @param year The year when the book was published.
     * @param publisher The publisher of book.
     * @param numPages The number of pages in the book.
     */
    private Book(String title, Genre genre, int year, String publisher, int numPages)
    {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.publisher = publisher;
        this.numPages = numPages;
        this.bookID = nextBookID++;
    }


    /**
     * Public constructor which helps create a book instance when there is one author.
     *
     * @param authorFamilyNames The family name of the author.
     * @param authorRestOfName The rest of the author's name.
     */
    public Book(String authorFamilyNames, String authorRestOfName, String title, Genre genre) {
        this(title, genre, 0, null, 0);
        this.authorNames = new String[]{authorFamilyNames, authorRestOfName};
    }


    /**
     * Public constructor which helps create a book instance when there are two  author.
     *
     * @param authorNames Names of the authors.
     * @param title Title of the Book.
     * @param genre The genre of the book.
     * @param year The year when the book was published.
     * @param publisher The publisher of book.
     * @param numPages The number of pages in the book.
     */

    public Book(String[] authorNames, String title, Genre genre,int year, String publisher, int numPages)
    {
        this(title, genre, year, publisher, numPages);
        this.authorNames = authorNames ;
    }

    /**
    * Public constructor which creates a book instance with one author.
     * @param authorFamilyNames The family name of the author.
     * @param authorRestOfName The rest of the author's name.
     * @param title Title of the Book.
     * @param genre The genre of the book.
     * @param year The year when the book was published.
     * @param publisher The publisher of book.
     * @param numPages The number of pages in the book.
     */

    public Book(String authorFamilyNames, String authorRestOfName, String title, Genre genre, int year, String publisher, int numPages) {
        this(title,genre, year, publisher, numPages);
        this.authorNames = new String[]{authorFamilyNames, authorRestOfName };
    }

    // Getters and setters for each attribute

    /**
     * Gets the authors family name.
     *
     * @return The authors family name.
     */

    public String getAuthorFamilyNames() {
        return authorNames[0];
    }

    /**
     * Sets the authors family name.
     *
     * @param authorFamilyName The authors family name.
     */

    public void setAuthorFamilyNames(String authorFamilyName) {
         authorNames[0] = authorFamilyName;
    }

    public String getAuthorRestOfName() {
        return authorNames[1];
    }


    public void setAuthorRestOfName(String authorRestOfName) {
        this.authorNames[1] = authorRestOfName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookID() {
        return bookID;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String[] getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(String[] authorNames) {
        this.authorNames = authorNames;
    }

    /**
     * Generates a citation for the book.
     *
     * @return The citation for the book.
     */
    public String getCitation(){
        StringBuilder authorName = new StringBuilder();
        for (int i = 0; i < authorNames.length; i+=2) {
            if(i > 0) {
                authorName.append(" and ");
            }
            authorName.append(authorNames[i]);
            authorName.append(", ");
            authorName.append(authorNames[i+1]);
        }

        if(genre == Genre.NON_FICTION)
            return  authorName + ". " +
                    title + ". " + publisher +  " (" + year + ") " + numPages + "pp.";
        else
            return authorName + ". " +
                    title + ".";
    }

    /**
     * Generates a string for the book.
     *
     * @return The string for the book.
     */

    @Override
    public String toString() {
        return authorNames[0]  + " " +
                authorNames[1] + " " +
                title + " " + bookID + " " + genre;
    }

    /**
     * Generates a string for the book.
     *
     * @return the string for the book.
     */

    public String getShortString() {
        // When there is more than one author it will add 'et al.' between the author name and title.
        return authorNames[0] + authorNames[1] + (authorNames.length == 2 ? "" : "et al.") +  title;
    }

}
