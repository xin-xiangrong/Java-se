package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("输入要归还图书的名称:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedsize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (name.equals(book.getName())){
                if(book.getBorrowed()){
                    book.setBorrowed(false);
                    System.out.println("归还成功！");
                    return;

                }else {
                    System.out.println("该书未借出！");
                    return;
                }
            }
        }
        System.out.println("没有找到你要归还的书");
    }
}
