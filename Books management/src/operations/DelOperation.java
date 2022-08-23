package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("输入要删除图书的名称:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedsize();

        //找到并记录要删除书的下标
        int index = -1;
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (name.equals(book.getName())){
                index = i;
                break;
            }
        }
        if(-1 == index) {
            System.out.println("没有找到要删除的这本书！");
        }else {
            for (int i = index; i < currentSize-1; i++) {
                Book book = bookList.getBooks(i+1);
                bookList.setBooks(book, i);
            }
            //每次删除，都要将原来最后一本书位置的引用置空
            bookList.setBooks(null,currentSize-1);
            bookList.setUsedsize(currentSize-1);
            System.out.println("删除成功");
        }
    }
}
