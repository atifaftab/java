//package maybank.controller;
//
//
//import maybank.entity.Book;
//import maybank.service.BookService;
//
//import java.util.List;
//
//@AllArgumentConstructor
//@NoArgumentConstructor
//@RestController("api/getAllBooks")
//public class BookController {
//
//    private BookService bookService;
//
//    @GetMapping
//    public ResponseEntity<List<Book>> getAllBooks() {
//        List<Book> listOfBooks = bookService.getAllBooks();
//        return ResponseEntity.status(HttpsStatus.OK).body(listOfBooks);
//    }
//}
