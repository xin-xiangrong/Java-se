package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("输入要借阅图书的名称:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedsize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (name.equals(book.getName())){
                if(book.getBorrowed()){
                    System.out.println("该书已经被借出！");
                    return;
                }else {
                    book.setBorrowed(true);
                    System.out.println("借阅成功！");
                    return;
                }
            }
        }
        System.out.println("没有找到你要借阅的书");
    }
}
