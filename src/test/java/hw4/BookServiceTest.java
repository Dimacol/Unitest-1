package hw4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    @Test
    void findBookByIdTest() {

        BookRepository mockBookRepository = mock(BookRepository.class);
        when(mockBookRepository.findById("3")).thenReturn(new Book("1", "Gold Fish", "Pushkin"));
        BookService bookService = new BookService(mockBookRepository);

        Book res = bookService.findBookById("3");

        assertEquals("Gold Fish", res.getTitle());
        assertEquals("Pushkin", res.getAuthor());

    }


    @Test
    void findAllBooksTest() {
        // Arrange
        BookRepository mockBookRepository = mock(BookRepository.class);
        when(mockBookRepository.findAll()).thenReturn(List.of(new Book("2", "Bal", "Fet")));
        BookService bookService = new BookService(mockBookRepository);

        // Act
        List<Book> res = bookService.findAllBooks();

        // Assert
        assertEquals(1, res.size());
        assertEquals("Bal", res.get(0).getTitle());
        assertEquals("Fet", res.get(0).getAuthor());
    }

}