package user;

import book.BookList;
import operations.IOperation;

public abstract class User {
    protected String name;
    protected IOperation[] iOperation;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public void doOperation(int choice, BookList bookList){
        iOperation[choice].work(bookList);
    }
}
