package book;

public class BookList {
    private Book[] books = new Book[100];
    private int usedsize;
    //书架当中默认有三本书

    public BookList() {
        this.books[0] = new Book("三国演义","罗贯中",66,"小说");
        this.books[1] = new Book("西游记","吴承恩",68,"小说");
        this.books[2] = new Book("红楼梦","曹雪芹",64,"小说");
        this.usedsize = 3;
    }

    public int getUsedsize() {
        return usedsize;
    }

    public void setUsedsize(int usedsize) {
        this.usedsize = usedsize;
    }


    public Book getBooks(int pos){
        return this.books[pos];
    }

    public void setBooks(Book book, int pos) {
        this.books[pos] = book;
    }
}
