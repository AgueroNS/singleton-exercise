package org.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ApplicationTest {
    private Library library;
    String book = "NewBook";

    @Before
    public void config() {
//        library = Library.getInstance();
    }

    @Test
    public void verifyCreateInstance() {
//        assertNotNull(Library.getInstance());
    }

    @Test
    public void verifyCreateSingleInstance() {
//        Library instanceA = Library.getInstance();
//        Library instanceB = Library.getInstance();

//        assertTrue(instanceA == instanceB);
    }

    @Test
    public void verifyPushPopBook() {
        assertTrue(library.pushBook(book));
        assertEquals(book, library.popBook());
    }

    @Test
    public void verifyLibraryCapacity() {
        library = pushAllBooks(library);
        assertFalse(library.pushBook(book));
    }

    @Test
    public void verifyEmptyLibrary() {
        assertNull(library.popBook());
    }

    @Test
    public void verifyLibraryDocuments() {
        // Get first Library instance
//        Library libraryA = Library.getInstance();

        // Create books
//        libraryA = pushAllBooks(libraryA);

        // Get second Library instance
//        Library libraryB = Library.getInstance();

        // Verify Library data
//        for(int index = libraryB.getCapacity(); index > 0; index--) {
//            assertEquals("Book" + index, libraryB.popBook());
//        }
    }

    private Library pushAllBooks(Library library) {
        // Push books
        for(int index = 1; index <= library.getCapacity(); index++) {
            library.pushBook("Book" + index);
        }

        return library;
    }
}
