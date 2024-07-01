/**
 * Initializes a shelf which stores books.
 * Shelf has shelf spaces and the spaces contains left end and right end.
 * Code allows to add books to left end of the shelf and remove books from the right end.
 */


public class Shelf {
    private ShelfSpace leftEnd;
    private ShelfSpace rightEnd;

    /**
     * Empty constructor which initializes an empty shelf.
     */
    public Shelf() {
        leftEnd = null;
        rightEnd = null;
    }


    /**
     * Adds a book to the left end of the shelf.
     * @param book The book to be added.
     */
    public void addLeft(Book book) {
        ShelfSpace newSpace = new ShelfSpace(book);
        if (leftEnd != null) {
            newSpace.setRightSpace(leftEnd);
            leftEnd.setLeftSpace(newSpace);
            leftEnd = newSpace;
        } else {
            leftEnd = newSpace;
            rightEnd = newSpace;
        }

    }

    /**
     * Removes and returns the book from the right end of shelf.
     * @return The book removed from the right end of the shelf.
     */
    public Book takeRight() {
        //When there are no books found the code will return null.
        if (rightEnd == null) {
            return null;
        }

        Book removedBook = rightEnd.getBook();
        //If this is last back to be returned and the shelf is empty it will set both the left and right end as null.
        if (rightEnd == leftEnd) {
            rightEnd = null;
            leftEnd = null;
        }
        else {
            //Moves the right end of shelf to the left end and removes the book.
            rightEnd = rightEnd.getLeftSpace();
            rightEnd.setRightSpace(null);
        }
        return removedBook;
    }
    /**
     * Empties the shelf and prints the books short string.
     */
    public void empty() {
        if (leftEnd == null && rightEnd == null) {
            return;
        }
        ShelfSpace currentSpace = rightEnd;
        while (currentSpace != null) {
            Book book = currentSpace.getBook();
            currentSpace = currentSpace.getLeftSpace();
            System.out.println(book.getShortString());
        }
        leftEnd = null;
        rightEnd = null;
    }

    /**
     * Prints all books on the shelf.
     * @return A string of all books on the shelf.
     */
    public String printAll() {
        if (leftEnd == null && rightEnd == null) {
            return "empty";
        } else {
            return recursiveprintAll(leftEnd);
        }
    }

    /**
     * Recursively prints all books on the shelf.
     * @param rightSpace The shelf space to start printing from.
     * @return A string of all books starting from left to right.
     */
    private String recursiveprintAll(ShelfSpace rightSpace) {
        if (rightSpace == null) {
            return " ";
        }
        return rightSpace.getBook().getShortString() + "\n" + recursiveprintAll(rightSpace.getRightSpace()) + "\n";
    }


    /**
     * Checks whether the shelf is empty.
     * @return true if both ends of the shelf are empty.
     */
    public boolean isEmpty() {
        return leftEnd == null && rightEnd == null;
    }
}


