/**
 * Represents a shelf's space that holds a book.
 */
public class ShelfSpace {
    private Book book;
    private ShelfSpace leftSpace;
    private ShelfSpace rightSpace;

    /**
     * Constructs a shelf space with a given book.
     *
     * @param book The book to be stored in the shelf space.
     */
    public ShelfSpace(Book book) {
        this.book = book;
    }

    /**
     * Get the book stores in the shelf space.
     *
     * @return the book stores in the shelf space.
     */
    public Book getBook() {
        return book;
    }

    /**
     * Get the space to left of the shelf space.
     *
     * @return The space to the left of the shelf space.
     */
    public ShelfSpace getLeftSpace() {
        return leftSpace;
    }

    /**
     * Sets the space to the left of this shelf space.
     *
     * @param leftSpace The space to be set to the left of this shelf space.
     */
    public void setLeftSpace(ShelfSpace leftSpace) {
        this.leftSpace = leftSpace;
    }

    public ShelfSpace getRightSpace() {
        return rightSpace;
    }

    public void setRightSpace(ShelfSpace rightSpace) {
        this.rightSpace = rightSpace;
    }


    /**
     * Returns a string of the shelf space.
     *
     * @return A string  of the shelf space.
     */
    @Override
    public String toString() {
        return book + " " + leftSpace + " " + rightSpace;
    }
}


