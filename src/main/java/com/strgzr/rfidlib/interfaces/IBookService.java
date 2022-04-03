package com.strgzr.rfidlib.interfaces;

import java.awt.print.Book;
import java.util.List;

public interface IBookService {

    Book addBookWithCode(String rfidCode, String isbn);

    Book addBookManually(Book book);

    List<Book> getAllBooks();

    Book getBookByCode(String rfidCode);

}
