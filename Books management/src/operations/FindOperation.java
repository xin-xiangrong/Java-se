package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("输入要查找图书的名称:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedsize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (name.equals(book.getName())){
                System.out.println("找到了，该书信息如下:");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有找到这本书！");
    }
}
