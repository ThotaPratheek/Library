/**
 * Code represents a library.
 * Library arranges books based on the genre.
 * Initializes all the different genres of books in arraylists.
 * Library enables the user to search for a book based on a specific keyword and genre.
 */

import java.util.ArrayList;

public class Library {
    private Shelf incoming;
    private ArrayList<Book> fantasy;
    private ArrayList<Book> crime;
    private ArrayList<Book> sciFi;
    private ArrayList<Book> romance;
    private ArrayList<Book> nonFiction;

    /**
     * Constructs a Library object with the incoming shelf.
     *
     * Initializes each genre-specific books array lists with an initial capacity of 6.
     *
     * @param incoming The incoming shelf which process books.
     */

    public Library(Shelf incoming) {
        setIncoming(incoming);
        this.fantasy = new ArrayList<>(6);
        this.crime = new ArrayList<>(6);
        this.sciFi = new ArrayList<>(6);
        this.romance = new ArrayList<>(6);
        this.nonFiction = new ArrayList<>(6);
    }

    /**
     * Gets the incoming shelf.
     *
     * @return The incoming shelf.
     */
    public Shelf getIncoming() {
        return incoming;
    }

    /**
     * Sets the incoming shelf.
     *
     * @param incoming The incoming shelf to be set.
     */
    public void setIncoming(Shelf incoming) {
        this.incoming = incoming;
    }

    public ArrayList<Book> getFantasy() {
        return fantasy;
    }

    public ArrayList<Book> getCrime() {
        return crime;
    }

    public ArrayList<Book> getSciFi() {
        return sciFi;
    }

    public ArrayList<Book> getRomance() {
        return romance;
    }

    public ArrayList<Book> getNonFiction() {
        return nonFiction;
    }

    //Processes books from the incoming shelf and distributes them to appropriate genre arrays.
    public void process() {
        while (!incoming.isEmpty()) {
            Book book = incoming.takeRight(); //Takes the rightmost book from the incoming shelf.
            if (book != null) {
                //Determines the genre of book and adds it to the correct genre array.
                switch (book.getGenre()) {
                    case FANTASY:
                        if (fantasy.size() < 6) {
                            fantasy.add(book);
                        }
                        break;
                    case CRIME:
                        if (crime.size() < 6) {
                            crime.add(book);
                        }
                        break;
                    case SCIENCE_FICTION:
                        if (sciFi.size() < 6) {
                            sciFi.add(book);
                        }
                        break;
                    case ROMANCE:
                        if (romance.size() < 6) {
                            romance.add(book);
                        }
                        break;
                    case NON_FICTION:
                        if (nonFiction.size() < 6) {
                            nonFiction.add(book);
                        }
                        break;
                }
            }
        }
    }

    /**
     * Searches for books with titles containing a specified keyword.
     *
     * @param genre The genre of books to search.
     * @param title The title of books to search for.
     */
    public void search(Genre genre, String title) {
        ArrayList<Book> books = new ArrayList<>();

        //Depending on the genre of the book it will reference to the correct genre arraylist.
        switch (genre) {
            case FANTASY:
                books = fantasy;
                break;
            case CRIME:
                books = crime;
                break;
            case SCIENCE_FICTION:
                books = sciFi;
                break;
            case ROMANCE:
                books = romance;
                break;
            case NON_FICTION:
                books = nonFiction;
                break;
        }

        //Tracks if the book was food.
        //Example: Searching for "justice". Will give you "Leckie, Ann. Ancillary Justice."
        boolean found = false;

        //Traverses through the books in a selected genre.
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                found = true;
                System.out.println(book.getCitation());
            }
        }

        if (!found) {
            System.out.println("No results found.");
        }
    }
}
