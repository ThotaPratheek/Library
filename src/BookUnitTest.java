
/**
 * Class is used to test all of the methods in the Book class.
 */

public class BookUnitTest {

    private static Book book1;
    private static Book book2;
    private static Book book3;
    private static Book book4;
    private static Book book5;
    private static Book book6;


    /**
     * The main method is used to run the test cases.
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        initializeBooks();
        testConstructorAndGetters();
        testSetters();
        testBookID();
        testToString();
        testgetCitation();
    }
    /**
     * Initializes all the book objects with test books.
     */
    public static void initializeBooks() {
        book1 = new Book("Newman", "Emma", "Planetfall", Genre.ROMANCE);
        book2 = new Book("Cline", "Ernest", "Ready Player One", Genre.SCIENCE_FICTION);
        book3 = new Book("Conway", "Elly", "Argylle", Genre.CRIME);
        book4 = new Book("Fujimoto", "Tatsuki", "Chainsaw Man", Genre.FANTASY);
        book5 = new Book("Hawking", "Stephen", "A Brief History of Time", Genre.NON_FICTION, 2023, "Fanum", 300);
        book6 = new Book(new String[]{"Abbate", "Janet", "Dick","Stephanie"}, "Abstractions & Embodiments", Genre.NON_FICTION, 2022, "JHUP", 459);
    }
    /**
     * Tests constructors and getters.
     */
    public static void testConstructorAndGetters() {
        String expectedResult = "NewmanEmmaPlanetfallROMANCE";
        String actualResult = book1.getAuthorFamilyNames() + book1.getAuthorRestOfName() + book1.getTitle() + book1.getGenre();

        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + actualResult);


        if (expectedResult.equals(actualResult)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(" ");
    }

    public static void testSetters() {
        book1.setTitle("Planetfall");

        String expectedResult2 = "Title: Planetfall";
        String actualResult2 = "Title: " + book1.getTitle();

        System.out.println("Expected Result: " + expectedResult2);
        System.out.println("Actual Result: " + actualResult2);

        if (expectedResult2.equals(actualResult2)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(" ");


    }

    public static void testBookID() {
        String expectedResult3 = "Planetfall: 1004825";
        String actualResult3 = book1.getTitle() + ": " + book1.getBookID();

        String expectedResult4 = "Ready Player One: 1004826";
        String actualResult4 = book2.getTitle() + ": " + book2.getBookID();

        String expectedResult5 = "Argylle: 1004827";
        String actualResult5 = book3.getTitle() + ": " + book3.getBookID();

        String expectedResult6 = "Chainsaw Man: 1004828";
        String actualResult6 = book4.getTitle() + ": " + book4.getBookID();

        String expectedResult7 = "A Brief History of Time: 1004829";
        String actualResult7 = book5.getTitle() + ": " + book5.getBookID();

        System.out.println("Expected Result: " + expectedResult3);
        System.out.println("Actual Result: " + actualResult3);
        if (expectedResult3.equals(actualResult3)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(" ");


        System.out.println("Expected Result: " + expectedResult4);
        System.out.println("Actual Result: " + actualResult4);
        if (expectedResult4.equals(actualResult4)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(" ");


        System.out.println("Expected Result: " + expectedResult5);
        System.out.println("Actual Result: " + actualResult5);
        if (expectedResult5.equals(actualResult5)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(" ");

        System.out.println("Expected Result: " + expectedResult6);
        System.out.println("Actual Result: " + actualResult6);
        if (expectedResult6.equals(actualResult6)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(" ");

        System.out.println("Expected Result: " + expectedResult7);
        System.out.println("Actual Result: " + actualResult7);
        if (expectedResult7.equals(actualResult7)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(" ");
    }


    public static void testToString() {
        String actualResult8 = book1.toString();
        String expectedResult8 = "Newman Emma Planetfall 1004825 ROMANCE";
        System.out.println("Expected Result: " + expectedResult8);
        System.out.println("Actual Result: " + actualResult8);
        if (expectedResult8.equals(actualResult8)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(" ");

    }

    public static void testgetCitation(){
        System.out.println(book5.getCitation());
        System.out.println(book6.getCitation());

    }

}