package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        int currentSize = bookList.getUsedsize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
