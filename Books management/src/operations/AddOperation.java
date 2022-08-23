package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        //输入图书信息
        System.out.println("输入新增图书名称:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("输入新增图书作者:");
        String author = scanner.nextLine();
        System.out.println("输入新增图书价格:");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("输入新增图书类型:");
        String type = scanner.nextLine();

        Book book = new Book(name, author, price, type);
        //获取存书位置
        int currentSize = bookList.getUsedsize();
        //把书放到书架（数组）
        bookList.setBooks(book, currentSize);
        //书的总数加1
        bookList.setUsedsize(currentSize+1);
        System.out.println("添加成功！");
    }
}
