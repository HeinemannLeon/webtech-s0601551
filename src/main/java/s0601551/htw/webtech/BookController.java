package s0601551.htw.webtech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/PagePilot")
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book(1L, "Harry Potter und der Stein der Weisen", "J.K. Rolling", "Fantasy", 336, 0, "ungelesen"));
        books.add(new Book(2L, "Girl on the Train", "Paula Hawkins", "Thriller", 464, 178, "wird gelesen"));
        books.add(new Book(3L, "Tschick", "Wolfgang Herrndorf", "Coming-of-Age", 256, 256, "beendet" ));

        return books;
    }
}